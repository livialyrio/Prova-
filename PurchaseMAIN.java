package main.java;

public class MyFirstApp {

    public static void main (String [] args) {
        
        Pessoa p1 = new Pessoa(); 
        /* p1.nome = "Geise";
        p1.peso = 61;
        p1.altura = 1.64f; 
        
        /* Pessoa p2 = new Pessoa ();

        p2.nome = "Gabriel";
        System.out.println (p1.nome + " " + p2.nome);
        float imc = p1.calcularIMC ();
        System.out.println (imc); */

        p1.getAdress().getStreet();

        p1.setNome ("Livia");
        System.out.println (p1.getNome ());

        p1.setSurname("Lyrio");
        System.out.println (p1.getSurname());

        p1.setFiscalNumber(135689);
        System.out.println (p1.getFiscalNumber());

        p1.getAdress().setStreet("maença");
        System.out.println (p1.getAdress().getStreet());

        p1.getAdress().setCity("Rio de Janeiro");
        System.out.println (p1.getAdress().getCity());

        p1.getAdress().setCountry("Brasil");
        System.out.println (p1.getAdress().getCountry());

        p1.getAdress().setZipcode("00000-000");
        System.out.println (p1.getAdress().getZipcode());

        Purchase pede1 = new Purchase();
    
        pede1.setPurchaseNumber(0);
        
        Item item1 = new Item();
        item1.setName("Coca-cola");
        item1.setValue(1.5);

        Item item2 = new Item();
        item2.setName("chocolate");
        item2.setValue(1.0);

        Item item3 = new Item();
        item3.setName("pizza");
        item3.setValue(10.0);

        Item item4 = new Item();
        item4.setName("dessert");
        item4.setValue(5.5);

        pede1.getItens().add( item1);
        pede1.getItens().add( item2);
        pede1.getItens().add( item3);
        pede1.getItens().add( item4);

        for (Item item: pede1.getItens()) {
            System.out.println("---> " + item.getName()+ item.getValue());
        }

    }    
}
