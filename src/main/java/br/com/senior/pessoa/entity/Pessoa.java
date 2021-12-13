package br.com.senior.pessoa.entity;

import javax.persistence.*;

@Entity
@Table
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String nome;

    @Column
    private double salario;

    @Column
    private String coisaFavorita;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCoisaFavorita() {
        return coisaFavorita;
    }

    public void setCoisaFavorita(String coisaFavorita) {
        this.coisaFavorita = coisaFavorita;
    }
}
