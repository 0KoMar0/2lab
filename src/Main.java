import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное значение x: ");
        double startX = scanner.nextDouble();

        System.out.print("Введите конечное значение x: ");
        double endX = scanner.nextDouble();

        System.out.print("Введите шаг: ");
        double step = scanner.nextDouble();
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();


        for (double x = startX; x <= endX; x += step) {
            double y;
            if (x <= 2) {
                y = (a + Math.pow(x, 2)) / (b + Math.log(Math.abs(x)) + 1);
            } else {
                y = Math.exp(x) + Math.pow(x, 2);
            }
            System.out.printf("x = %.3f, y = %.3f\n", x, y);
        }
    }
} 