import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int A = scan.nextInt();
	int B = scan.nextInt();
	if(A >= B*2){
		int Ans = A - B*2;
		System.out.println(Ans);
	}else{
		System.out.println("0");
		}
	}
}	