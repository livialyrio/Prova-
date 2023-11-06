package main.java;

import java.util.ArrayList;

public class Purchase {

    private int purchasenumber;
    private String date;
    private double value;
    private Pessoa person = new Pessoa();
    private ArrayList<Item> itens = new ArrayList<Item>();

    public void setPurchaseNumber(int purchasenumber) {
        this.purchasenumber = purchasenumber;
    }
    
    public int getPurchaseNumber(){
        return purchasenumber;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
    public String getDate(){
        return date;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    public double getValue(){
        return value;
    }

    public void setItens(ArrayList<Item> itens){
        this.itens = itens;
    }

    public ArrayList<Item> getItens(){
        return itens;
    }
