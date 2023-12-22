import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int d = num % 10;
		num /= 10;
		int c = num % 10;
		num /= 10;
		int b = num % 10;
		num /= 10;
		int a = num;
		
		if(a+b+c+d==7) System.out.println(a+"+"+b+"+"+c+"+"+d+"=7");
		else if(a+b+c-d==7) System.out.println(a+"+"+b+"+"+c+"-"+d+"=7");
		else if(a+b-c+d==7) System.out.println(a+"+"+b+"-"+c+"+"+d+"=7");
		else if(a-b+c+d==7) System.out.println(a+"-"+b+"+"+c+"+"+d+"=7");
		else if(a-b-c+d==7) System.out.println(a+"-"+b+"-"+c+"+"+d+"=7");
		else if(a-b+c-d==7) System.out.println(a+"-"+b+"+"+c+"-"+d+"=7");
		else if(a+b-c-d==7) System.out.println(a+"+"+b+"-"+c+"-"+d+"=7");
		else if(a-b-c-d==7) System.out.println(a+"-"+b+"-"+c+"-"+d+"=7");
		
		in.close();

	}

}