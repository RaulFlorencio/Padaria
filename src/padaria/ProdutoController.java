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
public class ProdutoController extends Pessoa {

    private static long nextCodigo;
    private static ArrayList<Produto> produtos;

    public ProdutoController() {
        nextCodigo = 0;
        produtos = new ArrayList();
    }

    public void cadastrar(double preco, String descricao, String dataValidade, int quantidade) {
        nextCodigo++;
        Produto produto;
        try {
            produto = new Produto(nextCodigo, preco, descricao, dataValidade, quantidade);
            produtos.add(produto);
        } catch (Exception ex) {
            Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listar() {
        for (Produto p : produtos) {
            System.out.println(p.toString());
        }
    }

    public void buscar(String descricao) {
        for (Produto p : produtos) {
            if (p.getDescricao().contains(descricao)) {
                p.toString();
            }
        }
    }

    public void buscar(long codigo) {
        for (Produto p : produtos) {
            if (p.getCodigo() == codigo) {
                p.toString();
            }
        }
    }

    public void buscarPreco(double preco) {
        for (Produto p : produtos) {
            if (p.getPreco() == preco) {
                p.toString();
            }
        }
    }

    public double maxPreco() {
        double max = 0d;
        for (Produto p : produtos) {
            if (p.getPreco() > max) {
                max = p.getPreco();
            }
        }
        return max;
    }

    public double minPreco() {
        if (produtos.isEmpty()) {
            return 0d;
        }
        double min = produtos.get(0).getPreco();
        for (Produto p : produtos) {
            if (p.getPreco() < min) {
                min = p.getPreco();
            }
        }
        return min;
    }

    public double avgPreco() {
        if (produtos.isEmpty()) {
            return 0d;
        }
        double avg = 0d;
        for (Produto p : produtos) {
            avg += p.getPreco();
        }
        avg /= produtos.size();
        return avg;
    }

    public int qtdSupeiorAvgPreco() {
        double avg = avgPreco();
        int qtd = 0;
        for (Produto p : produtos) {
            if (p.getPreco() > avg) {
                qtd++;
            }
        }
        return qtd;
    }

    void remover(long codigo) {
        for (int i = 0; i<produtos.size();i++) {
            Produto p = produtos.get(i);
            if (p.getCodigo() == codigo) {
                produtos.remove(i);
            }
        }
    }

}
