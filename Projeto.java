package Empresa;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nome;
    private ArrayList<Tarefa> tarefas = new ArrayList<>();
    
    public Projeto(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // ID é gerado automaticamente
    public void adicionarTarefa(String descricao, Membro membro, String status) {
        int id = tarefas.size(); 
        Tarefa novaTarefa = new Tarefa(descricao, membro, status, id);
        tarefas.add(novaTarefa);
}

    
    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println("ID: " + tarefa.getId() + 
                                   ", Descrição: " + tarefa.getDescricao() + 
                                   ", Status: " + tarefa.getStatus());
                if (tarefa.getMembroResponsavel() != null) {
                    System.out.println("Membro Responsável: " + tarefa.getMembroResponsavel().getNome());
                } else {
                    System.out.println("Nenhum membro responsável atribuído.");
                }
            }
        }
    }
}
