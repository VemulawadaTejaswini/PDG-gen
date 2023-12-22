import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int a = scan.nextInt();
        
        int d = n % 500;
        
        if(a >= d) System.out.println("Yes");
        else System.out.println("No");
        
    }
}
