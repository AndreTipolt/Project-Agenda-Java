package entities;

public class ContatoBasico {
    
    private String nome;

    private String telefone;

    public ContatoBasico() {
    }

    public ContatoBasico(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void getDados(){
        
    }
}
