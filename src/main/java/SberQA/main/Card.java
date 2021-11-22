package SberQA.main;

public class Card {

    public static void main(String[] args) {

        Person person1 = new Person();

        //Заполняем базовые данные
        person1.setName("Nurymova Loisan");
        person1.setGender("Female");
        person1.setSalary(500000);
        person1.setAge(60);
        //Считаем срок до пенсии и выводим всей информации
        person1.getRetairmentInfo();
        person1.getAllInfo();

        Person person2 = new Person();

        //Заполняем базовые данные
        person2.setName("Ruslan Mussin");
        person2.setGender("Queer");
        person2.setSalary(40000);
        person2.setAge(17);
        //Считаем срок до пенсии и выводим всей информации
        person2.getRetairmentInfo();
        person2.getAllInfo();


        Person person3 = new Person();

        //Заполняем базовые данные
        person3.setName("Georgiy Zainullin");
        person3.setGender("Male");
        person3.setSalary(70000);
        person3.setAge(68);
        //Считаем срок до пенсии и выводим всей информации
        person3.getRetairmentInfo();
        person3.getAllInfo();

        Person person4 = new Person();

        //Заполняем базовые данные
        person4.setName("Anthony Soprano");
        person4.setGender("Male");
        person4.setSalary(100000);
        person4.setAge(45);
        //Считаем срок до пенсии и выводим всей информации
        person4.getRetairmentInfo();
        person4.getAllInfo();

    }
}

