
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        long A;
        long B;


        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextLong();
            B = sc.nextLong();
        }
        long result = 1;

        long l = gcd(A,B);
        long t = (long) Math.sqrt(l);
        for(long i =2; i <= t;i++){
            if(l % i != 0){
                continue;
            }

            result++;
            while(true){
                if(l%i == 0){
                    l = l/i;
                }else{
                    break;
                }
            }
        }


        System.out.println(result);

    }
    //最大公約数
    static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (long) b;
    }

}
