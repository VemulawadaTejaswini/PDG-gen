import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int k=sc.nextInt();
		double ans=0;

		int times=0;
		for(int i=n;i>0;--i){
			while(i*Math.pow(2, times)<k)++times;
			ans=ans+(1/(double)n)*Math.pow(0.5, times);

		}
		System.out.println(ans);
	}
}