import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void scanArray(Scanner sc, int[] array, int num) {
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
    }

    //最小公倍数
    static long lcm(long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (long) (c / b);
    }
    //最大公約数
    static long gcd (long a, long b) {
        long temp;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (long)b;
    }

    public static void main(String[] args) {

        int N;
        int K;
        HashSet<Integer> dSet = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            K = sc.nextInt();

            for (int i = 0; i < K; i++) {
                int n = sc.nextInt();
                dSet.add(n);
            }
        }

        int result = N;
        while(true){
            if(checkNumaber(result,dSet)){
                break;
            }
            result++;
        }
        System.out.println(result);


    }

    static boolean checkNumaber(int target,HashSet<Integer> set){
        int n = target;
        boolean result = true;
        while(true){
            int i = n%10;
            if(set.contains(i)){
                result = false;
                break;
            }
            if(n<10){
                break;
            }
            n = n/10;
        }
        return result;
    }



}
