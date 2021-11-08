package SberQA.main.persons;

public class Person {
    public int age = 0; // Поле класса, у int Значение по умолчания 0
    public double weight = 0;
    public int money = 0;

    public String name = "unnamed human"; //Поле класса, у String Значение по умолчания null
    public String profession = "unnamed profesion";
    public String car = "unnamed car";

    public void sayAge() {
        System.out.println("Age: " + age);
    }

    public void sayStaj() {
        System.out.println("Weight: " + weight);
    }

    public void sayName() {
        System.out.println("Name: " + name);
    }

    public void sayProfession() {
        System.out.println("Profession: " + profession);
    }

    public void sayCar() {
        System.out.println("Car model: " + car);
    }

    public void sayMoney() {
        System.out.println("Money: " + money);
    }

    public void getAllInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Experience: " + weight);
        System.out.println("Profession: " + profession);
        System.out.println("Car model: " + car + "\n");
    }

    public void countMoney(int m1, int m2, int m3) {
        int mc;
        mc = m1 + m2 + m3;
        System.out.println("Total money: " + mc + " Tenge");
    }

    public void countAge(int a1, int a2, int a3) {
        int ac;
        ac = a1 + a2 + a3;
        System.out.println("Total age: " + ac + " years");

    }
    public void countWeight(double sj1, double sj2, double sj3) {
        double sjc;
        sjc = sj1 + sj2 + sj3;
        System.out.println("Total weight: " + sjc + " kg");

    }


}



