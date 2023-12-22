import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long AB = A+B;
        long ans;
        if(A == 0)
            ans = 0;
        else
            ans = (long)(N/AB) * A + Math.min((N%AB), A);
        System.out.println(ans);
    }
}
