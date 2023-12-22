import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		a+=b;
		c+=d;

		//Left を、釣り合うなら Balanced を、右に傾くなら Right を出力してくださ
if(a>c){
	System.out.println("Left");
}else if(a==c){
	System.out.println("Balanced");
}else{System.out.println("Right");}
	}}