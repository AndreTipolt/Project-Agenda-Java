package entities;

public class ContatoComercial extends ContatoBasico{
    
    private String atividade;

    private String funcionario;

    private String nome;

    public ContatoComercial() {
    }

    public ContatoComercial(String atividade, String funcionario, String nome) {
        this.atividade = atividade;
        this.funcionario = funcionario;
        this.nome = nome;
    }

    public void getDados(){}
}
