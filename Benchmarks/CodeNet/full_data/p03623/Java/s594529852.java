import java.util.*;

public class Main {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int selA = Math.abs(x - a);
        int selB = Math.abs(x - b);
        
        if (selA > selB) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}