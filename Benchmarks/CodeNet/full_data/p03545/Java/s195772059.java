import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = x/1000;
		int b = x/100 -a*10;
		int c = x/10 -a*100 - b*10;
		int d = x-a*1000-b*100-c*10;

		if(a+b+c+d==7)
			System.out.print(a+"+"+b+"+"+c+"+"+d+"=7");
		else {
			if(a+b+c-d==7)
				System.out.print(a+"+"+b+"+"+c+"-"+d+"=7");
			if(a+b+c-d<7){
				if(a+b-c-d==7)
					System.out.print(a+"+"+b+"-"+c+"-"+d+"=7");
				if(a-b+c-d==7)
					System.out.print(a+"-"+b+"+"+c+"-"+d+"=7");
				if(a-b-c-d==7)
					System.out.print(a+"-"+b+"-"+c+"-"+d+"=7");
			}
			if(a-b-c+d==7)
				System.out.print(a+"-"+b+"-"+c+"+"+d+"=7");

			if(a-b+c+d==7)
				System.out.print(a+"-"+b+"+"+c+"+"+d+"=7");
			if(a+b-c+d==7)
				System.out.print(a+"+"+b+"-"+c+"+"+d+"=7");
		}
	}
}
