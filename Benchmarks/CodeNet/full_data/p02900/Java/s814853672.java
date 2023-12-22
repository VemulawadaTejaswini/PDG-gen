import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int n = 1;
        long a=  A;
        long b = B;

        for(long i = 2; Math.min(a,b) / 2 > i; i++){
            if(A % i ==0 && B % i == 0 && Main.primeNumber(i) == 0){
                n ++;
                A = A / i;
                B = B / i;
            }
        }

        System.out.println(n);

    }

    private static int primeNumber(long n) {
        for(long i = 2; i < n; i++) {
            if(n % i == 0) {
                return 1; //素数ではない
            }
        }
        return 0; //素数である
    }

}





