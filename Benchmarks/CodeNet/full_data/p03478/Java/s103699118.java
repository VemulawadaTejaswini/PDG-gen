import java.util.Scanner;

public class Main{
	public static int total(int t) {
		int sum=0;
		while(t!=0) {
			sum+=t%10;
			t/=10;
		}
		return sum;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int result=0;
		for(int i=1;i<=N;i++) {
			if(A<=total(i)&&total(i)<=B)
				result+=i;
		}
		System.out.println(result);
	}
}