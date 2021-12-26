package online.fortis;

public class Main {
    public static void main(String[] args) {
        // пустая строчка до
        System.out.println();

        // собака
        Dog dog = new Dog();
        dog.color = "Рыжая";
        dog.name = "Клементина";
        dog.yearOfBirth = 2009;
        dog.breed = "такса";

        dog.sayColor();
        dog.sayBreed();
        dog.sayName();
        dog.countAge();

        System.out.print("живёт в квартире ");

        // квартира
        Apartment hata = new Apartment();
        hata.footage = 51.8D;
        hata.age = 42;
        hata.floor = 6;
        hata.district = "в Московском районе.";

        hata.sayFootage();
        hata.countYear();
        hata.sayFloor();
        hata.sayDistrict();

        // пустая строчка после
        System.out.println();


    }
}