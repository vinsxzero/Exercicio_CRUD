/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author alunos
 */
public class Games {
    private int id;
    private String nome;
    private String sinopse;
    private String datalancamento;
    private double preco;
    private String plataforma;
    private double quantidadesvendidas;
    private String categoria;
    private String desenvolvedora;
    private double notametacritic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDatalancamento() {
        return datalancamento;
    }

    public void setDatalancamento(String datalancamento) {
        this.datalancamento = datalancamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getQuantidadesvendidas() {
        return quantidadesvendidas;
    }

    public void setQuantidadesvendidas(double quantidadesvendidas) {
        this.quantidadesvendidas = quantidadesvendidas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public double getNotametacritic() {
        return notametacritic;
    }

    public void setNotametacritic(double notametacritic) {
        this.notametacritic = notametacritic;
    }
}
