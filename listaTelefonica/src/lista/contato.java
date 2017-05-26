/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lista;

/**
 *
 * @author JeanPedro
 */
public class contato {
     private Integer id;
     private String nome;
     private Integer telefone;
     private String tipo;

    contato() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return  id + nome + telefone + tipo;
    }

    public contato(Integer id, String nome, Integer telefone, String tipo) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.tipo = tipo;
    }


     
}
