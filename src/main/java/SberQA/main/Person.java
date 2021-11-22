package SberQA.main;

public class Person {

    private String name;
    private String gender;
    private int salary;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("\n" + "Input field must not be empty");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("\n" + name + "Input field must not be less than null");
        } else if (salary > 500000) {
            System.out.println("\n" + name + "'s" + " Salary: " + salary + " Tenge" + ", It's good enough for basic needs");
            this.salary = salary;
        } else if (salary < 42500) {
            System.out.println("\n" + name + "'s" + " Salary: " + salary + " Tenge" + ", omg! find a better job");
            this.salary = salary;
        } else {
            this.salary = salary;
        }
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("\n" + name + "'s age is - " + age + " This person is underage");
            this.age = age;
        } else if (age > 65) {
            System.out.println("\n" + name + "'s age is - " + age + " Its time for a Quit, you are old man");
            this.age = age;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        String male = "Male";
        String female = "Female";

        if (gender.equals(male)) {
            this.gender = gender;
        } else if (gender.equals(female)) {
            this.gender = gender;
        } else {
            System.out.println("\n" + gender + " - Sorry the is no such gender");
        }
    }

    public String getGender() {
        return gender;
    }

    public int getRetairmentInfo() {
        int years = 65 - age;
        return years;
    }

    public void getAllInfo() {
        System.out.println("\n" + name + "'s" + " Card Information: " + "\n" + "Gender: " + gender + "\n" + "Age: " + age + " Years" + "\n" +
                "Salary: " + salary + "\n" + "Remain for Retirement: " + getRetairmentInfo() + "\n");
    }
}

