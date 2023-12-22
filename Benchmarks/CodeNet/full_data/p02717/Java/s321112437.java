import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int a, b, c;
        try(Scanner sc = new Scanner(System.in)){
            a = Integer.parseInt(sc.next());
            b = Integer.parseInt(sc.next());
            c = Integer.parseInt(sc.next());
        }
        
        int temp = a;
        a = b;
        b = temp;
        
        temp = a;
        
        a = c;
        c = temp;
        
        System.out.printf("%s %s %s", a, b, c);
    }
}