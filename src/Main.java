import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int resultFactorial = Math.calcFactorial(num);
        System.out.println(resultFactorial);
    }
}

/* 4. Написать функцию, принимающую на вход целое число, и возвращающую факториал данного числа. *Написать две версии программы(рекурсивная версия).*/
