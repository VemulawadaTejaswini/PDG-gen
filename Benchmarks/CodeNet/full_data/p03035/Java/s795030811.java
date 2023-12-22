import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int price = 0;
		if(a >= 13){
			price = b;
		}else if(a >= 6){
			price = b / 2;
		}
		System.out.println(price);
	}
}
