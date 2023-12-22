import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		int a = (int) Math.round(n/1.08);
		int b = (int) Math.floor(a*1.08);
		if(n==b){
			System.out.println(a);
		}else{
			System.out.println(":(");
		}
	}

}
