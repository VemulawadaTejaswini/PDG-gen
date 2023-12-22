import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long A = Long.parseLong(sc.next());
		long B = Long.parseLong(sc.next());
		long ans;
		if(A==0){
			ans = func(B);
		}else{
			ans = func(A-1)^func(B);
		}
		System.out.println(ans);
		sc.close();
	}
	public static long func(long n){
		if(n%4 == 0)return n;
		if(n%4 == 1)return n^(n-1);
		if(n%4 == 2)return n^1;
		if(n%4 == 3)return n^(n-1)^1;
		System.out.println("NG");
		return 0;
	}

}
