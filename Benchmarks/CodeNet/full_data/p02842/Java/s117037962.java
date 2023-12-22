import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double a = Math.ceil(n/1.08);
		double b = Math.floor(a*1.08);
		if(n==b){
			int c = (int)a;
			System.out.println(c);
		}else{
			System.out.println(":(");
		}
	}

}
