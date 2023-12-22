import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = 1;
        while((m+1) * (m+1) <= n) {
            m++;
        }
        for(;m>=1;m--) {
            if(n % m == 0) {
                long res = m + (n / m) - 2;
                System.out.println(res);
                return;
            }
        }

    }
}
