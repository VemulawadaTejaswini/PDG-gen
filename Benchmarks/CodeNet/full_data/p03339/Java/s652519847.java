import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int min = 300000;
		int foo = 0;
		String s;
		String reader;
		
		
		n = sc.nextInt();
		s = sc.next();
		
		for(int i = 0; i < n; i++){
			foo = 0;
			reader = s.substring(i,i+1);
			foo += s.substring(0,i).length() - s.substring(0,i).replaceAll("W", "").length();
			foo += s.substring(i+1,n).length() - s.substring(i+1,n).replaceAll("S", "").length();
			min = Math.min(min, foo);
		}
		if(min != 300000)
		System.out.println(min);
		else
		System.out.println(0);
	}
}
