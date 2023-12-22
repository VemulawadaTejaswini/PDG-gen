import java.util.Scanner;

public class Main{

public static void main(String[] args) {

	/*System.out.println("数字を入力してください");*/
	Scanner scanner=new Scanner(System.in);

	int n = scanner.nextInt();
	int a = scanner.nextInt();
	int b = scanner.nextInt();

	/*System.out.println(n+" "+a+" "+b);*/

	int x,y;

	if((a%2==0&&b%2==0)||(a%2!=0&&b%2!=0)) {
		x=(b-a)/2;
		System.out.println(x);
		}else{
		y=Math.min(a-1, n-b)+1+(b-a-1)/2;
		System.out.println(y);
	}
}
}
