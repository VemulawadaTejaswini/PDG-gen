import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(min(a+b, b+c, c+a));
		sc.close();
	}
	
	static int min(int... args) {
		int min = args[0];
		for(int i = 0; i < args.length; i++) {
			if(args[i] < min) min = args[i];
		}
		return min;
	}
}
