import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int c=a+b,d=a*b;
		
		if (c==15){
			System.out.println("+");
		}else if (d==15){
			System.out.println("*");
		}else{
			System.out.println("x");
		}
		
	}
}
