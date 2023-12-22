import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();	//S
		long m=sc.nextLong();	//C
		int cnt=0;
		if( m>=n*2) {	
			cnt+=(m/4)+n;
		}else{
			cnt+=m/2;
		}

		System.out.println(cnt);
	}
}