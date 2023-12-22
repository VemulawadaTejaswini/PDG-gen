import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = (double)b/a;
		//System.out.println(c);
		int ans = (int)Math.ceil(c);
		System.out.println(ans);
	}
	
	}