/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;



/**
 *
 * @author Deivi
 */
public class QuartoHotel {
    private int numQuarto;
    private double valorDiaria;
    private boolean situacao;
    private String dataEntrada;
    private double totalFaturado;
    private Hospede hospede;
    private Atendente atendente;
    
    //CONSTRUTOR
    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
    }
    //RESERVAR
    public void reservar(Hospede h, Atendente a){
        situacao = true;
        atendente = a;
        hospede = h;
        //a.addQuartoHotel(this);
        h.setQuartoHotel(this);
    }
    //LIBERAR
    public double liberar(int dias, double taxaDesconto){
        double valorHospedagem =0;
        situacao = false;
        dataEntrada =null;
        hospede = null;
        atendente.removeQuartoHotel(this);
        atendente = null;
        valorHospedagem += (dias * valorDiaria) - ((dias * valorDiaria) * taxaDesconto);
        totalFaturado = valorHospedagem;
        return valorHospedagem;
    }
    
    //SETS

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    
    //GETS

    public int getNumQuarto() {
        return numQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Atendente getAtendente() {
        return atendente;
    }
    
    
}
