import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        long num = sc.nextInt();
        for(long i = 0; i < num; i++) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            count = 0;
            boolean isPrime = true;
            for(long j = a; j <= b; j += 2) {


                for(int k = 3; k <= Math.sqrt(j); k+=2) {
                    if(num % k == 0) {
                        isPrime = false;
                    }

                }

                if((j+1)/2 % 2 == 0) isPrime = false;
                if((j+1)/2 == 2)     isPrime = true;
                for(int k = 3; k <= Math.sqrt((j+1)/2); k+=2) {
                    if(num % k == 0) {
                        isPrime = false;
                    }

                }
                if(isPrime) {
                    count++;
                }



            }
            System.out.println(count);
        }

    }
}
