import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       Rectangle rectangle = new Rectangle();

        System.out.println("Informe as medidas do retangulo:");
        System.out.println("Altura:");
        rectangle.height = sc.nextDouble();

        System.out.println("Largura:");
        rectangle.width = sc.nextDouble();

        double area = rectangle.area();
        double perimeter = rectangle.perimeter();
        double diagonal = rectangle.diagonal();

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PERIMETER = %.2f%n", perimeter);
        System.out.printf("DIAGONAL = %.2f%n", diagonal);

       sc.close();
    }
}
