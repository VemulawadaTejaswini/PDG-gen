import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum=0;
        int i=1;
        while (i<=n){
            int sho = n/i;
            int amari =n%i;
            if(sho==amari) {
                sum = sum + i;
                i=i*2-2;
            }
            i=i+1;
        }
        System.out.println(sum);
    }
}
