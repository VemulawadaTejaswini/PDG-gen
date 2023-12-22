import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();	//S
		long m=sc.nextLong();	//C
		int cnt=0;
		if( m>=n*2) {	//s:c=1:2なので
			cnt+=n;
			m=m-(cnt*2);
		}else if(n>m && n>=1 && m>=2){
			cnt+=m/2;
		}
		if(m>=4){		//cが4個でScc作れる
			cnt+=m/4;
		}
		System.out.println(cnt);
	}
}