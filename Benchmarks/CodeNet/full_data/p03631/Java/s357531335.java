import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
		int num = in.nextInt();	
		int a = num/100;
		int b = num%100/10;
		int c = num%100%10;
		if(num == c*100+b*10+a)
		{
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		}
	}
}
