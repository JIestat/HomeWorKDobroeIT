public class Math {
    public static int calcFactorial(int a){
        int result;

        if(a==1){
            return 1;
        }else {
            result = calcFactorial(a - 1) * a;
        }
        return result;
    }
}
