package Empresa;

public class Tarefa {
    private int id;
    private String descricao;
    private Membro membroResponsavel;
    private String status;  
    
    public Tarefa(String descricao, Membro membroResponsavel, String status, int id) {
        this.status = status;  
        this.descricao = descricao;
        this.id = id;
        this.membroResponsavel = membroResponsavel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Membro getMembroResponsavel() {
        return membroResponsavel;
    }

    public void setMembroResponsavel(Membro membroResponsavel) {
        this.membroResponsavel = membroResponsavel;
    }

    public String getStatus() {
        return status;  
    }

    public void setStatus(String status) {
        this.status = status; 
    }
    
    public String imprimir() {
        return "ID: " + id + ", Descrição: " + descricao + ", Status: " + status;
    }
}
