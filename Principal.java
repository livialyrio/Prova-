//Star wars

public class Principal {
    public static void main(String[] args) {
        Pessoa P1 = new Pessoa();
        Pessoa P2 = new Pessoa("Luke", "Skywalker", "Masculino");
        
        P1.setNome("Leia");
        P1.setSobrenome("Organa");
        P1.setSexo("Feminino");

        System.out.println(P1.getNome() + " " + P1.getSobrenome() + " " + P1.getSexo());
        System.out.println(P2.getNome() + " " + P2.getSobrenome() + " " + P2.getSexo());
    }
}
