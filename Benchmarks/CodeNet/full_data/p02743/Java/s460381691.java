import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long m=4*a*b;
        long n=c*c+b*b+a*a+2*a*b-2*a*c-2*b*c;
        if(m>=n||c<=a+b)
            System.out.print("No");
        else
            System.out.print("Yes");

    }
}