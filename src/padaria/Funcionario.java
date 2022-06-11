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
public class Funcionario extends Pessoa implements IPessoa {
    private String cpf;
    private String cargo;
    private String telefone;  
    private long codigo;
    private double salario;

    public Funcionario(long codigo, String cpf, String cargo, String telefone, String nome, int idade, double salario) throws Exception {
        super(nome, idade);
        this.codigo = codigo;
        this.cpf = cpf;
        this.cargo = cargo;
        this.telefone = telefone;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public String getTelefone() {
        return telefone;
    }

    public long getCodigo() {
        return codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void exibir() {
        System.out.println("Funcionario{"
                + "codigo=" + codigo
                + ", nome=" + getNome()
                + ", idade=" + getIdade()
                + ", telefone=" + telefone
                + ", cpf=" + cpf
                + ", cargo=" + cargo 
                +  ", salario=" + salario +'}');
        
    }
    
}
