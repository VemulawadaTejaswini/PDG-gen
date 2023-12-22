import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int min = 300000;
		int foo = 0;
		String s;
		
		n = sc.nextInt();
		s = sc.next();
		int end = n-1;
		
		foo = (n-1) - s.substring(1,n).replaceAll("E", "").length();
		min = Math.min(min, foo);
		
		for(int i = 1; i < end; i++){
			foo = 0;
			foo += i - s.substring(0,i).replaceAll("W", "").length();
			foo += (n-i-1) - s.substring(i+1,n).replaceAll("E", "").length();
			min = Math.min(min, foo);
		}
		foo = n - s.substring(0,n).replaceAll("W", "").length();
		min = Math.min(min, foo);
		
		if(min != 300000)
		System.out.println(min);
		else
		System.out.println(0);
	}
}
