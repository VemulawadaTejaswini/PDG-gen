import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = c - (a - b);
		if(ans >= 0)
			System.out.println(ans);
		else
			System.out.println(0);
		
	}

	}