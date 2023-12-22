import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        double x=Math.sqrt(a);
        double y=Math.sqrt(b);
        double z=Math.sqrt(c);
        if(x+y<z)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}