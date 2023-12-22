import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int num4 = num1-num2;
		int ans = num3-num4;
		
		if(ans<0){
			ans = 0;
		}
		
		System.out.println(ans);
	}
}