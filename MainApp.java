package Empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    private static ArrayList<Projeto> projetos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Cadastrar Projeto");
            System.out.println("2 - Adicionar Tarefa a um Projeto");
            System.out.println("3 - Adicionar Membro a uma Tarefa");
            System.out.println("4 - Listar Projetos");
            System.out.println("5 - Mostrar Projeto específico (ID)");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProjeto();
                    break;
                case 2:
                    adicionarTarefa();
                    break;
                case 3:
                    adicionarMembroATarefa();
                    break;
                case 4:
                    listarProjetos();
                    break;
                case 5:
                    mostrarProjetoEspecifico();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void cadastrarProjeto() {
        System.out.print("Digite o nome do Projeto: ");
        String nomeProjeto = scanner.nextLine();
        Projeto projeto = new Projeto(nomeProjeto);
        projetos.add(projeto);
        System.out.println("Projeto '" + nomeProjeto + "' cadastrado com sucesso!");
    }

    private static void adicionarTarefa() {
        listarProjetos();
        System.out.print("Digite o ID do Projeto: ");
        int idProjeto = scanner.nextInt();
        scanner.nextLine();

        if (idProjeto >= 0 && idProjeto < projetos.size()) {
            Projeto projeto = projetos.get(idProjeto);
            System.out.print("Descrição da Tarefa: ");
            String descricao = scanner.nextLine();
            System.out.print("Status da Tarefa: ");
            String status = scanner.nextLine();

            System.out.print("Deseja adicionar um membro à tarefa? (s/n): ");
            String opcao = scanner.nextLine();
            Membro membro = null;
            if (opcao.equalsIgnoreCase("s")) {
                membro = cadastrarMembro();
            }

            projeto.adicionarTarefa(descricao, membro, status);
            System.out.println("Tarefa adicionada com sucesso ao projeto '" + projeto.getNome() + "'");
        } else {
            System.out.println("ID de Projeto inválido!");
        }
    }

    private static void adicionarMembroATarefa() {
        listarProjetos();
        System.out.print("Digite o ID do Projeto: ");
        int idProjeto = scanner.nextInt();
        scanner.nextLine();

        if (idProjeto >= 0 && idProjeto < projetos.size()) {
            Projeto projeto = projetos.get(idProjeto);
            projeto.listarTarefas();

            System.out.print("Digite o ID da Tarefa: ");
            int idTarefa = scanner.nextInt();
            scanner.nextLine();

            if (idTarefa >= 0 && idTarefa < projeto.getTarefas().size()) {
                Membro membro = cadastrarMembro();
                projeto.getTarefas().get(idTarefa).setMembroResponsavel(membro);
                System.out.println("Membro adicionado com sucesso à tarefa!");
            } else {
                System.out.println("ID de Tarefa inválido!");
            }
        } else {
            System.out.println("ID de Projeto inválido!");
        }
    }

    private static Membro cadastrarMembro() {
        System.out.print("Nome do Membro: ");
        String nome = scanner.nextLine();
        System.out.print("Cargo do Membro: ");
        String cargo = scanner.nextLine();
        return new Membro(nome, cargo);
    }

    private static void listarProjetos() {
        if (projetos.isEmpty()) {
            System.out.println("Nenhum projeto cadastrado.");
        } else {
            for (int i = 0; i < projetos.size(); i++) {
                Projeto projeto = projetos.get(i);
                System.out.println("ID: " + i + ", Nome: " + projeto.getNome());
            }
        }
    }

    private static void mostrarProjetoEspecifico() {
        listarProjetos();
        System.out.print("Digite o ID do Projeto: ");
        int idProjeto = scanner.nextInt();
        scanner.nextLine();

        if (idProjeto >= 0 && idProjeto < projetos.size()) {
            Projeto projeto = projetos.get(idProjeto);
            System.out.println("\n----- Detalhes do Projeto -----");
            System.out.println("Nome: " + projeto.getNome());
            System.out.println("Tarefas:");
            projeto.listarTarefas();
        } else {
            System.out.println("ID de Projeto inválido!");
        }
    }
}
