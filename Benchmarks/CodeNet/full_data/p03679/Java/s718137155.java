import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		new Main().solve();
	}
	
	void solve(){
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		if(A>=B){
			System.out.println("delicious");
		}else if(B-A<=X){
			System.out.println("safe");
		}else{
			System.out.println("dangerous");
		}
	}
	
}