import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();

        long res = (n/k) * (n/k) * (n/k);
        if(k%2 == 0) {
            long div = n/k;
            if(n%k >= k/2) {
                div++;
            }
            res += div * div * div;
        }
        System.out.println(res);
    }

}
