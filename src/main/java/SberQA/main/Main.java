package SberQA.main;


import SberQA.main.persons.Person;

public class Main {

    // Модификаторы доступа ||static -> возвращает значение -> имя -> список аргументов
    public static void main(String[] args) {

        Person kush = new Person();
        kush.name = "Kanat Zhymanov";
        kush.age = 29;
        kush.weight = 65.5;
        kush.profession = "lead QA";
        kush.car = "Camry";
        kush.money = 3000;

        Person alex = new Person();
        alex.name = "Alexey Rychko";
        alex.age = 39;
        alex.weight = 68.2;
        alex.profession = "middle QA";
        alex.car = "bmx";
        alex.money = 5000;

        Person kairat = new Person();
        kairat.name = "Kairat Manas";
        kairat.age = 18;
        kairat.weight = 46.9;
        kairat.profession = "junior QA";
        kairat.car = "bike";
        kairat.money = 250;
        kush.getAllInfo();
        alex.getAllInfo();
        kairat.getAllInfo();

        Person persons = new Person();
        persons.countAge(kush.age, alex.age, kairat.age);
        persons.countMoney(kush.money, alex.money, kairat.money);
        persons.countWeight(kush.weight, alex.weight, kairat.weight);
    }

}
// Тип данных -> Переменная
// String message = "HelloWorld! \nIm QA";
// Класс -> Объект -> Метод
// System.out.println()
