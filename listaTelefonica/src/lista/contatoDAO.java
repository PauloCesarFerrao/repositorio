package lista;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class contatoDAO {
    
    List<contato> listaBD = new ArrayList();
    
    public List<contato> getALL() throws ClassNotFoundException, SQLException {
        List<contato> listaBD = new ArrayList();
        try {
            //1- registrar a classe principal do driver do PostgreSQL
            Class.forName("org.postgresql.Driver");
            //2 - Definir a URL JDBC para conecar ao BD da biblioteca 
            String url = "jdbc:postgresql://localhost/adressbuch";
            //3 - Cria uma conexão com o BD 
            Connection con = DriverManager.getConnection(url, "postgres", "masterkey");
            //4 - Cria um objeto para executar instruções SQL no BD 
            Statement stmt = con.createStatement();
            //5 - executar uma consulta em uma tabela
            String sql = "SELECT * FROM contato";
            ResultSet rs = stmt.executeQuery(sql);
            //6 - percorrer o resultset pegando registro a registro
            while (rs.next()) {
                contato obj = new contato(rs.getInt("id"), rs.getString("nome"),rs.getInt("telefone"),rs.getString("tipo"));
                listaBD.add(obj);
            }

        } catch (ClassNotFoundException ex) {
            System.out.println("Classe do driver não encontrada!");
        } catch (SQLException ex) {
            System.out.println("Erro na conexão ao BD!");
        }

        return listaBD;

    }


    public void incluir(contato obj) throws Exception {
        //obterTodos();
        if (listaBD.contains(obj)){
        } else {
            //1- registrar a classe principal do driver do PostgreSQL
            Class.forName("org.postgresql.Driver");
            //2 - Definir a URL JDBC para conecar ao BD da biblioteca 
            String url = "jdbc:postgresql://localhost/adressbuch";
            
            //3 - Cria uma conexão com o BD 
            Connection con = DriverManager.getConnection(url, "postgres", "masterkey");

            //4 - Definir uma instrução SQL
            String sql = "INSERT INTO contato values (?,?,?,?)";

            //5 - executar uma consulta em uma tabela
            PreparedStatement stmt = con.prepareCall(sql);

            //6- Pegamos os dados do objeto e colocamos no statement
            stmt.setInt(1, obj.getId());
            stmt.setString(2, obj.getNome());
            stmt.setInt(3, obj.getTelefone());
            stmt.setString(4, obj.getTipo());
            

            //7- Executar
            int i = stmt.executeUpdate();

            //8-mostrar a menssagem de qnts registros foram afetados
            System.out.println(i + " registros foram afetados!!!");
            
          
        }
    
    }

    void excluir(contato obj) throws SQLException, ClassNotFoundException {
        String sql = "DELETE from contato where id =?";

        //5 - executar uma consulta em uma tabela
        PreparedStatement stmt = ConexaoBD.getInstance().getCon().prepareStatement(sql);
        //6- Pegamos os dados do objeto e colocamos no statement
        stmt.setInt(1, obj.getId());

        //7- Executar
        int i = stmt.executeUpdate();

        //8-mostrar a menssagem de qnts registros foram afetados
        System.out.println(i + " registros foram afetados!!!");
        
    }

    void editar(contato obj) throws SQLException {
        String sql = "UPDATE contato set id=?, nome=?, telefone=?, tipo=? WHERE id=?";

        //5 - executar uma consulta em uma tabela
        PreparedStatement stmt = ConexaoBD.getInstance().getCon().prepareStatement(sql);
        //6- Pegamos os dados do objeto e colocamos no statement
        
            stmt.setInt(1, obj.getId());
            stmt.setString(2, obj.getNome());
            stmt.setInt(3, obj.getTelefone());
            stmt.setString(4, obj.getTipo());
            stmt.setInt(5, obj.getId());
        

        //7- Executar
        int i = stmt.executeUpdate();

        //8-mostrar a menssagem de qnts registros foram afetados
        System.out.println(i + " registros foram afetados!!!");
        if(i==0){
        JOptionPane.showMessageDialog(null, "Código não pode ser alterado!");
        }
        
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}