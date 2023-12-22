import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a = n/100;		//100の位
		int c = (n%100)%10;	//1の位
		
		if(a==c){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
		sc.close();
	}
}