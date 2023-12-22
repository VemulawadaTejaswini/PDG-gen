import java.util.*;
//import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int D = sc.nextInt();
        int N = sc.nextInt();
        //int[] m = new int[N];
        int ans = 0;
        
        ans = N * (int)Math.pow(100,D);
        
        System.out.println(ans);
    }
}
