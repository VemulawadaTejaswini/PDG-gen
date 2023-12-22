import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long x = Long.parseLong(sc.next());
        long low = (a+x-1)/x;
        long high = b/x;
        long result = Math.max(0, high-low+1);
        System.out.println(result);
    }
}