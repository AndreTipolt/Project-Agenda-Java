package entities;

public class Telefone {
    
    private String numero;

    private String tipo;

    public Telefone() {
    }

    public Telefone(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }
}
