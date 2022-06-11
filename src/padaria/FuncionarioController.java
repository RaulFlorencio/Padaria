/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padaria;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul
 */
public class FuncionarioController extends Pessoa {

    private static long nextCodigo;
    private static ArrayList<Funcionario> funcionarios;

    public FuncionarioController() {
        nextCodigo = 0;
        funcionarios = new ArrayList();
    }

    public void cadastrar(String cpf, String cargo, String telefone, String nome, int idade, double salario){
        nextCodigo++;
        Funcionario funcionario;
        try {
            funcionario = new Funcionario(nextCodigo, cpf, cargo, telefone, nome, idade, salario);
            funcionarios.add(funcionario);
        } catch (Exception ex) {
            Logger.getLogger(FuncionarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listar() {
        for (Funcionario f : funcionarios) {
            f.exibir();
        }
    }

    public void buscar(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().contains(nome)) {
                f.exibir();
            }
        }
    }

}
