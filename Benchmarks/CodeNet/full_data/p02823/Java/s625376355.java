import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        if ((b-a)%2==0){
            System.out.println((b-a)/2);
            return;
        }

        long ans = 0;

        if ((a-1)<(n-b)){
            ans += (a-1);
            a = 1;
            b -= (a-1);
            ans += 1;
            b -= 1;
            ans += (b-a)/2;
            System.out.println(ans);
            return;
        }else {
            ans += (n-b);
            b = n;
            a += (n-b);
            ans += 1;
            a += 1;
            ans += (b-a)/2;
            System.out.println(ans);
            return;
        }


    }
}