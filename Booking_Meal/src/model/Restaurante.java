package model;

public class Restaurante {
    String nome,
           morada,
           contacto,
           especialidade;
    int id;

    public Restaurante(String nome, String morada, String contacto, String especialidade, int id) {
        this.nome = nome;
        this.morada = morada;
        this.contacto = contacto;
        this.especialidade = especialidade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
