import java.io.BufferedInputStream;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static long combination(int n,int k){
        if(k==0)
            return 1;
        else
            return combination(n,k-1)*(n-k+1)/k;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        c+=Main.combination(a,2);
        c+=Main.combination(b,2);
        System.out.println(c);

    }
}