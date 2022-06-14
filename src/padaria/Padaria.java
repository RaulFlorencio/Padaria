package padaria;

import java.util.Scanner;

public class Padaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        ClienteController clienteController = new ClienteController();
        FuncionarioController funcionarioController = new FuncionarioController();
        ProdutoController produtoController = new ProdutoController();
        menu:
        while (true) {
            System.out.println("|1| Cadastrar cliente");
            System.out.println("|2| Cadastrar funcionário");
            System.out.println("|3| Cadastrar produto");
            System.out.println("|4| Listar clientes");
            System.out.println("|5| Listar funcionários");
            System.out.println("|6| Listar produtos");
            System.out.println("|7| Buscar clientes por nome");
            System.out.println("|8| Buscar funcionario por nome");
            System.out.println("|9| Buscar produto por nome");
            System.out.println("|10| Buscar produto por código");
            System.out.println("|11| Buscar produto por preco");
            System.out.println("|12| Produto mais caro");
            System.out.println("|13| Produto mais barato");
            System.out.println("|14| Produto preço médio");
            System.out.println("|15| Produto acima do preço médio");
            System.out.println("|16| Remover cliente por código");
            System.out.println("|17| Remover funcionário por código");
            System.out.println("|18| Remover produto por código");
            System.out.println("|19| Sair");
            System.out.println("Digite a Opção: ");
            String opcao = scanner.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("-------------Casdastrar cliente-------------");
                    System.out.println("Nome:");
                    String nome = scanner.nextLine();
                    System.out.println("Idade:");
                    int idade = Integer.parseInt(scanner.nextLine());
                    System.out.println("Telefone:");
                    String telefone = scanner.nextLine();
                    System.out.println("Email:");
                    String email = scanner.nextLine();
                    clienteController.cadastrar(nome, idade, telefone, email);
                    break;
                case "2":
                    System.out.println("-------------Casdastro funcionario-------------");
                    System.out.println("CPF:");
                    String cpf = scanner.nextLine();
                    System.out.println("Nome:");
                    nome = scanner.nextLine();
                    System.out.println("Idade:");
                    idade = Integer.parseInt(scanner.nextLine());
                    System.out.println("Telefone:");
                    telefone = scanner.nextLine();
                    System.out.println("Cargo:");
                    String cargo = scanner.nextLine();
                    System.out.println("Salario:");
                    double salario = Double.parseDouble(scanner.nextLine());
                    funcionarioController.cadastrar(cpf, cargo, telefone, nome, idade, salario);
                    break;
                case "3":
                    System.out.println("-------------Cadastrar produto-------------");
                    System.out.println("Descrição:");
                    String descricao = scanner.nextLine();
                    System.out.println("Preço:");
                    double preco = Double.parseDouble(scanner.nextLine());
                    System.out.println("Quantidade:");
                    int quantidade = Integer.parseInt(scanner.nextLine());
                    System.out.println("Data validade:");
                    String dataValidade = scanner.nextLine();
                    produtoController.cadastrar(preco, descricao, dataValidade, quantidade);
                    break;
                case "4":
                    System.out.println("-------------Listar clientes-------------");
                    clienteController.listar();
                    break;
                case "5":
                    System.out.println("-------------Listar funcionários-------------");
                    funcionarioController.listar();
                    break;
                case "6":
                    System.out.println("-------------Listar produtos-------------");
                    produtoController.listar();
                    break;
                case "7":
                    System.out.println("-------------Buscar clientes por nome-------------");
                    System.out.println("Nome:");
                    nome = scanner.nextLine();
                    clienteController.buscar(nome);
                    break;
                case "8":
                    System.out.println("-------------Buscar funcionario por nome-------------");
                    System.out.println("Nome:");
                    nome = scanner.nextLine();
                    funcionarioController.buscar(nome);
                    break;
                case "9":
                    System.out.println("-------------Buscar produto por nome-------------");
                    System.out.println("Nome:");
                    nome = scanner.nextLine();
                    produtoController.buscar(nome);
                    break;
                case "10":
                    System.out.println("-------------Buscar produto por codigo-------------");
                    System.out.println("Nome:");
                    long codigo = Long.parseLong(scanner.nextLine());
                    produtoController.buscar(codigo);
                    break;
                case "11":
                    System.out.println("-------------Buscar produto por preco-------------");
                    System.out.println("Preço:");
                    preco = Double.parseDouble(scanner.nextLine());
                    produtoController.buscarPreco(preco);
                    break;
                case "12":
                    System.out.println("-------------Produto mais caro-------------");
                    System.out.println(produtoController.maxPreco());
                    break;
                case "13":
                    System.out.println("-------------Produto mais barato-------------");
                    System.out.println(produtoController.minPreco());
                    break;
                case "14":
                    System.out.println("-------------Produto preço médio-------------");
                    System.out.println(produtoController.avgPreco());
                    break;
                case "15":
                    System.out.println("-------------Produto acima do preço médio-------------");
                    System.out.println(produtoController.qtdSupeiorAvgPreco());
                    break;
                case "16":
                    System.out.println("-------------Remover cliente por código-------------");
                    System.out.println("Código:");
                    codigo = Long.parseLong(scanner.nextLine());
                    clienteController.remover(codigo);
                    break;
                case "17":
                    System.out.println("-------------Remover funcionário por código-------------");
                    System.out.println("Código:");
                    codigo = Long.parseLong(scanner.nextLine());
                    funcionarioController.remover(codigo);
                    break;
                case "18":
                    System.out.println("-------------Remover produto por código-------------");
                    System.out.println("Código:");
                    codigo = Long.parseLong(scanner.nextLine());
                    produtoController.remover(codigo);
                    break;
                case "19":
                    System.out.println("-------------Godbye!-------------");
                    break menu;
            }
        }

    }
}
