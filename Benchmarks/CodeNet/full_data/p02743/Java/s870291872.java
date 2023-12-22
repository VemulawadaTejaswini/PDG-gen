import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long c = scan.nextLong();
        scan.close();
        long d = c - (a + b);

        if(d <= 2) System.out.println("No");
        else if(4 * a * b < (d * d)) System.out.println("Yes");
        else System.out.println("No");
    }
}