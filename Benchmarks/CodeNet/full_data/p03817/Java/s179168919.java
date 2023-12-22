import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		
		int r = 0;
		if(0<x%11 && x%11<=5)
			r = 1;
		else if(0<x%11 && x%11<=10)
			r = 2;
			
		System.out.println(x/11*2+r);
	}
}
