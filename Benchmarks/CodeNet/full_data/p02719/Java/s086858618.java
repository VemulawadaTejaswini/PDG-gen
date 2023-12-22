import java.io.*;
import java.math.*;
import java.util.*;


public class Main	 {
    public static void main(String[] args) throws IOException {
        	Scanner sc = new Scanner(System.in);
        	long n = sc.nextLong();
        	long k = sc.nextLong();
        	if(n<k)
        		System.out.println(n);
        	else if(n==k)
        		System.out.println(0);
        	else
        		System.out.println(k-(k-(n%k)));
    }
}
