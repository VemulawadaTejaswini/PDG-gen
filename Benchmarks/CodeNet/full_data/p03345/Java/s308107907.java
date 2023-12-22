import java.math.BigInteger;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long k = input.nextLong();
 
        if (k == 0){
            System.out.println(-1);
            return;
        }else {
            System.out.println(Math.pow(10,18) > Math.abs(a-b)? "Unfair" : Math.abs(a-b));
        }
    }
}