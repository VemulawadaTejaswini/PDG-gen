import java.util.*;
 
public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long A = sc.nextLong();
    	long B = sc.nextLong();
    	long C = sc.nextLong();
    	long K = sc.nextLong();
    	System.out.println(K%2 == 0 ? A - B : B - A);
    }
}