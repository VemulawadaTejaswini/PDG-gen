import java.util.Scanner;

public class Main {


    static long MAX = 1_000_000_000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        long A = findFactor(S);
        System.out.println("0 0 "+A+" 0 0 "+S/A);


    }

    static long findFactor(long n){

        while(n%2 ==0){
            n = n/2;
            if(n<=MAX ) return n;
        }

        for (int i = 3; i <= Math.sqrt(n); i = i+2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                n = n/i;
                if(n<=MAX ) return n;
            }
        }
        return n;
    }


}
