import java.util.*;
import java.lang.*;
import java.io.*;
     
public class Main {
	public static void main(String[] args) {
	
		try (Scanner sc = new Scanner(System.in)){
			
			int n = sc.nextInt();
            System.out.println(getA(n));
		}
    }

    public static int getA(int n){
        int result = 0;
        if (n % 2 ==0) {
            return n;
        } else {
            return n * 2;
        }
    }
}