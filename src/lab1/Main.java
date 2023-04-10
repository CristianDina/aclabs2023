package lab1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Cristi", 28);
        person.walks();
        person.setAge(person.getAge() + 1);
        System.out.println(person.getName() + " is " + person.getAge() + " years old.");

        Person person1 = new Person("Andrei", 29);
        person1.walks();
        person1.setAge(person.getAge() + 1);
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");

    }
}
