import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a == 0){
            System.out.println("0");
        }else{
            long t = n / (a + b);
            long m = n % (a + b);
            long sum = t * a + Long.min(a, m);
            System.out.println(sum);
        }
    }
}