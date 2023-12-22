import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        Set<Integer> s = new HashSet<Integer>();
        s.add(a);
        s.add(b);
        s.add(c);
        System.out.println(s.size());
    }
}