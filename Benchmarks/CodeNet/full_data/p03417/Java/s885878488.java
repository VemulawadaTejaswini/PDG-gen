import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.println(cardDown(a,b));
    }
    
    private static long cardDown(int a, int b){
        if(a == 1 && b == 1) return 1;
        if(a == 1 || b == 1) return a*b - 2;
        
        return (long)a*b - 2*a - 2*b + 4;
    }
}
