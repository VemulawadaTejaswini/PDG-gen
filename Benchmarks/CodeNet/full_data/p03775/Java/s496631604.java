import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        int ans = Long.toString(a).length();
        for(long i=1; i*i<=a; i++) {
            if(a%i ==0 ) {
                int length = Long.toString(a/i).length();
                if(ans > length) {
                    ans = length;
                }
            }
        }
        System.out.println(ans);
    }
}