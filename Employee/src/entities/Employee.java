package entities;

public class Employee{
    public double salary;
    public String name;
    public double tax;

    public double netSalary(){
        return salary - tax;
    }

    public void increaseSalary(double percentage){
        salary += salary * percentage/ 100.0;
    }

    public String toString(){
       return name + ", $ " + String.format("%.2f", netSalary());
    }
}
