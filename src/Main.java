import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Math sum = new Math();

        System.out.println("Введите  число A: ");
        int a = scanner.nextInt();
        System.out.println("Введите  число B: ");
        int b = scanner.nextInt();
        System.out.println("Введите  число C: ");
        int c = scanner.nextInt();

        int totalSum = sum.addPositiveNumbers(a,b,c);
        System.out.println("Сумма чисел: "+totalSum);
    }

}
/*1. Написать метод, который получает на вход 3 числа и возвращает сумму лишь положительных из них. К примеру, на вход 1, 100, -2 = 101(-2 - отрицательное).*/

