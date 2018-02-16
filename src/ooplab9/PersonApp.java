package ooplab9;

public class PersonApp {

    public static void main(String[] args) {
        Person person = new Person("Anon Wunthae",21,
                new Address("98/3 M.5","Huasai",
                        "80170"),
                new Job("Teacher",15000));
        System.out.println(person.toString());


    }//main
}//class