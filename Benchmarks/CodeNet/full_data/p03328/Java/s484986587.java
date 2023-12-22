import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		/*
		int s = sc.nextInt();
		if(s < 1000)
			System.out.println("ABC");
		else
			System.out.println("ABD");
			*/
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sa = b-a;
		int ans = 0;
		for(int i = 0 ; i <= sa ; i++){
			ans+=i;
		}
		System.out.println(ans - b);
	}
}
