import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();

        if(a < k){
            long c = k - a;
            if(b < c){
                System.out.println(0 + " " + 0);
            }
            else{
                long d = b - c;
                System.out.println(0 + " " + d);
            }
        }
        else{
            long c = a - k;
            System.out.println(c + " " + b);
        }
    }
}
