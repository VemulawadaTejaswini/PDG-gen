import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
 
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
		int sum=0;
		int ten=N;
		
		while(ten>0) {
			sum+=ten %10;
			ten/=10;
		}
		System.out.println(N%sum==0 ? "Yes":"No");
		
	}
}