import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final int a = sc.nextInt();
        final int b = sc.nextInt();
        final int c = sc.nextInt();
        sc.close();

        double ad = Math.sqrt(a);
        double bd = Math.sqrt(b);
        double cd = Math.sqrt(c);
        if (ad + bd < cd) {
            System.out.println("Yes");
        } else
            System.out.println("No");
    }
}