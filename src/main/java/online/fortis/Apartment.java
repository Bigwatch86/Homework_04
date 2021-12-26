package online.fortis;

public class Apartment {
    double footage;
    int floor;
    int year;
    int age;
    String district;

    public void sayDistrict() {
        System.out.print(district);
        System.out.print(" ");
    }

    public void sayFootage() {
        System.out.print(footage);
        System.out.print(" квадратных метров, ");
    }

    public void sayFloor() {
        System.out.print(" на ");
        System.out.print(floor);
        System.out.print(" этаже ");
    }

    public void countYear() {
        year = 2021 - age;
        System.out.print(year);
        System.out.print(" года постройки,");
    }
}
