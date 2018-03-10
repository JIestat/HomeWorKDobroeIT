public class Math {

    public int addPositiveNumbers(int a, int b, int c) {
        int resultA = 0;

        if (a > 0) {
            resultA += a;
            System.out.println("Число А:"+a+" не отрицательное суммируем ");
        } else {
            System.out.println("Число A:"+a+"  отрицательное число не суммируем ");
        }

        int resultB = 0;
        if (b > 0) {
            resultB += b;
            System.out.println("Число В:"+b+" не отрицательное суммируем ");
        } else {
            System.out.println("Число B: "+b+" отрицательное число не суммируем ");
        }

        int resultC = 0;
        if (c > 0) {
            resultC += c;
            System.out.println("Число C:"+b+" не отрицательное суммируем ");
        } else {
            System.out.println("Число C:"+c+"  отрицательное число не суммируем ");
        }
        System.out.println();
        int result = resultA+resultB+resultC;
        return result;
    }

}
