package src.main.java;

public class Pessoa {

    public String nome, sobrenome;
    public double peso, altura, IMC;

    public double calculaIMC(double p, double a) {
;
        this.IMC = p / (a*a);

        return IMC;
    };

    private String getName(){

        return nome;
    }

    public void setName(String nome){
        this.nome = nome;
    }

    private Double getPeso(){

        return peso;
    }
    private Double getAltura(){

        return altura;
    }
    private  String getSobrenome(){
        return sobrenome;
    }


    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
};
