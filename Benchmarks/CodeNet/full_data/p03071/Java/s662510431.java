import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		//System.out.println("max="+max);
		//System.out.println("min="+min);
		ans += max;
		ans += Math.max(max-1, min);
		System.out.println(ans);
	}

}