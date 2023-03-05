import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Informe os seguintes dados:");
        System.out.print("Nome:");
        employee.name = sc.nextLine();
        System.out.print("Salario bruto:");
        employee.salary = sc.nextDouble();
        System.out.print("Imposto:");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);
        System.out.print("Qual a porcentagem de aumento no salario?");
        double percentagem = sc.nextDouble();
        employee.increaseSalary(percentagem);

        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
