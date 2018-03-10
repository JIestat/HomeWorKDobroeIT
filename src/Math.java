public class Math {

    public int addPositiveNumbers(int a, int b, int c) {
        int resultA = 0;

        if (a > 0) {
            resultA += a;
        } else {
            System.out.println("A:  отрицательное число");
        }

        int resultB = 0;
        if (b > 0) {
            resultB += b;
        } else {
            System.out.println("B:  отрицательное число");
        }

        int resultC = 0;
        if (c > 0) {
            resultC += c;
        } else {
            System.out.println("C:  отрицательное число");
        }

        int result = resultA+resultB+resultC;
        return result;
    }

}
