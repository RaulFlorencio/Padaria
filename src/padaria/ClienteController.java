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
public class ClienteController extends Pessoa {

    private static long nextCodigo;
    private static ArrayList<Cliente> clientes;

    public ClienteController() {
        nextCodigo = 0;
        clientes = new ArrayList();
    }

    public void cadastrar(String nome, int idade, String telefone, String email) {
        nextCodigo++;
        Cliente cliente;
        try {
            cliente = new Cliente(nextCodigo, nome, idade, telefone, email);
            clientes.add(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listar() {
        for (Cliente c : clientes) {
            c.exibir();
        }

    }

    public void buscar(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().contains(nome)) {
                c.exibir();
            }
        }
    }

}
