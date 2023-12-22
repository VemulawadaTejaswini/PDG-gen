import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = c-a-b;
        if(4*a*b < d * d && d > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
