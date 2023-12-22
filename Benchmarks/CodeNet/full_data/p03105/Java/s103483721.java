import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();//一回
		int b = sc.nextInt();//所持
		int c = sc.nextInt();//満足
		if(b>=a*c){
			System.out.println(c);
		}else{
			c=b/a;
			System.out.println(c);
		}

	}}