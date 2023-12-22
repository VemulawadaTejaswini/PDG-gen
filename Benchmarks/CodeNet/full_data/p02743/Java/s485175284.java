import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        double aa = Math.sqrt(a);
        double bb = Math.sqrt(b);
        double cc = Math.sqrt(c);
        if(aa+bb<cc) System.out.print("Yes");
        else System.out.print("No");

    }

}
