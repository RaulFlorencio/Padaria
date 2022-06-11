/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria;

/**
 *
 * @author Raul
 */
public class Cliente extends Pessoa implements IPessoa {

    private long codigo;
    private String telefone;
    private String email;

    public long getCodigo() {
        return codigo;
    }

    public Cliente(long codigo, String nome, int idade, String telefone, String email) throws Exception {
        super(nome, idade);
        this.codigo = codigo;
        this.telefone = telefone;
        this.email = email;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibir() {
        System.out.println("Cliente{"
                + " codigo=" + codigo
                + ", nome=" + getNome()
                + ", idade=" + getIdade()
                + ", telefone=" + telefone
                + ", email=" + email + '}');
    }

}
