package entities;

import java.util.Calendar;

public class EContato extends Contato{
    
    private String email;
    private String homePage;
    private String nome;
    private Calendar dtNasc;
    private String hp;

    public EContato() {
    }
    
    public EContato(String email, String homePage, String nome, Calendar dtNasc, String hp) {
        this.email = email;
        this.homePage = homePage;
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.hp = hp;
    }

    public String getEmail() {
        return email;
    }
    public String getHomePage() {
        return homePage;
    }
    public void getDados(){}
}
