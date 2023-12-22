import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = sc.nextLong();
		
		int r = 0;
		if(x%11>0){
			r = x%11<=6 ? 1 : 2;
		}
			
		System.out.println(x/11*2+r);
	}
}
