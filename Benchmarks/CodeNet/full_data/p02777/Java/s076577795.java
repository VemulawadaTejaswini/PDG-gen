import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String T = sc.next();		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String U = sc.next();
      
		if(S.equals (U)) {
			a--;
		}else {
			b--;
		}
		
		System.out.print(a+" "+b);
		

	}

}

