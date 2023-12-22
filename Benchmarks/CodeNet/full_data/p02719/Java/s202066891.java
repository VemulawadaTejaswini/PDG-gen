import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
    public static void main (String[]args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        while (true){
            if (k==1){
                break;
            }
            long temp=Math.abs(k-n);
            if (temp<n){
                n=temp;
            }else{
                break;
            }
        }
        System.out.println(k==1?k:n);
    }
}
