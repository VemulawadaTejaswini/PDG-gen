import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a;
        n = Integer.parseInt(sc.next());
        a = Integer.parseInt(sc.next());
        
        if(a == 0) System.out.print("No");
        else System.out.println("Yes");
        
        sc.close();
    }
}
