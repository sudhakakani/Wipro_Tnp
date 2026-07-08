class Person {
    private String name;

    Person() {
    }

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    Employee(String name, double salary, int year, String insurance) {
        super(name);
        annualSalary = salary;
        yearStarted = year;
        nationalInsuranceNumber = insurance;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }
}

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee("Rakesh", 500000, 2024, "NI12345");

        System.out.println("Name : " + e.getName());
        System.out.println("Salary : " + e.getAnnualSalary());
        System.out.println("Year Started : " + e.getYearStarted());
        System.out.println("Insurance No : " + e.getNationalInsuranceNumber());
    }
}