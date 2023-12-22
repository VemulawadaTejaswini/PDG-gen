
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long sum=a+b;
        if(sum%2==0) {
            long ans = sum/2;
            System.out.println(ans);
        }
        else
            System.out.println("IMPOSSIBLE");
    }
}
