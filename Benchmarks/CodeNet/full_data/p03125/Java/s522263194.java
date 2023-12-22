import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		long a = sc.nextLong();
		long b = sc.nextLong();
 
		if(b/a==0||b==a){
		    System.out.println(a+b);
		}else{

            System.out.println(b-a);
		}
	}
}