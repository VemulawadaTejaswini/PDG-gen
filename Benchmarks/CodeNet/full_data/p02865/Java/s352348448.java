import java.util.*;
public class Main { 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = 0;
		if(n % 2 == 0) {
			a = n / 2 - 1;
		}
		else{a = n / 2;}
		System.out.println(a);
     }
}