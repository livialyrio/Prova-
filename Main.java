// Suits

public class Main {
    public static void main(String[] args) {
        Person Human = new Person();
        Person Human2 = new Person("Louis", "Litt", "Masculino");
        Person Human3 = new Person("Donna", "Paulsen", "Feminino");

        Human.setName("Harvey");
        Human.setSurname("Specter");
        Human.setGender("Masculino");

        System.out.println(Human.getName() + " " + Human.getSurname() + " " + Human.getGender());
        System.out.println(Human2.getName() + " " + Human2.getSurname() + " " + Human2.getGender());
        System.out.println(Human3.getName() + " " + Human3.getSurname() + " " + Human3.getGender());
    }
}
