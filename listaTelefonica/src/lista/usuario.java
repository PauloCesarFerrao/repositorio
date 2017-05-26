package lista;

/**
 *
 * @author JeanPedro
 */
public class usuario {
     Integer id;
     String nome;
     String senha;
     String email;

    usuario() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return  id + nome + senha + email;
    }

    public usuario(Integer id, String nome, String senha, String email) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }


     
}
