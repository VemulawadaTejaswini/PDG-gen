import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if(a+b+c >= 22){
            System.out.println("bust");
        }else{
            System.out.println("win");
        }
        
    }
}

