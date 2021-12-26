package online.fortis;

public class Dog {
    String color;
    int yearOfBirth;
    int age;
    String breed;
    String name;

    public void sayColor() {
        System.out.print(color);
        System.out.print(" ");
    }
    public void sayName() {
        System.out.print(name);
        System.out.print(" ");
    }

    public void sayBreed() {
        System.out.print(breed);
        System.out.print(" ");
    }

    public void countAge() {
        age = 2021 - yearOfBirth;
        System.out.print(age);
        System.out.print(" лет ");
    }

}
