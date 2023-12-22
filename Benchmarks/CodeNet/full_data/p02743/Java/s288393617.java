import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long c = Long.parseLong(sc.next());
        if(4*a*b < Math.pow((c-a-b), 2)) System.out.println("Yes");
        else System.out.println("No");
    }
}