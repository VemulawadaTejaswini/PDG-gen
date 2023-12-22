import java.io.*;
import java.util.*;
import java.util.stream.*;
import java.math.*;
 
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        
        int res=k*x + (n-k)*y;
        

        System.out.println(res);
    }
}


