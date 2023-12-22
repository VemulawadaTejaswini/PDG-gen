import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int workspace;
        
        workspace = a;
        a = b;
        b = workspace;
        
        workspace = a;
        a = c;
        c = workspace;
        
        System.out.print(a + " " + b + " " + c);
    }
}