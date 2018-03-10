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


