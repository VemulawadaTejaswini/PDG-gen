import java.util.*;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if(c - a - b > 0 && (Math.pow((c - a - b), 2)) > 4 * a * b){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
	}
}