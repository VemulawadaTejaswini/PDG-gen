import java.util.Scanner;

public class Main{
	static  int c=1;
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int ans=0;
		int n=stdin.nextInt();
		int m=stdin.nextInt();
		if(n>=3 && m>=3){
			ans=(n-2)*(m-2);
		}
		else if(n>=3 &&m<3){
			if(m%2==0) ans=0;
			else if(m%2==1) ans=n-2;
		}
			else if(n<3 &&m>=3){
				if(n%2==0) ans=0;
				else if(n%2==1) ans=m-2;
			}
				else if(n<3 &&m<3){
					if(n%2==1 && m%2==1) ans=1;
					else ans=0;
				}
		System.out.println(ans);
	}
}