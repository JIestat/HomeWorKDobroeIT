import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Math sum = new Math();

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int totalSum = sum.addPositiveNumbers(a,b,c);
        System.out.println(totalSum);
    }

}
//1. Написать метод, который получает на вход 3 числа и возвращает сумму лишь положительных из них. К примеру, на вход 1, 100, -2 = 101(-2 - отрицательное).

