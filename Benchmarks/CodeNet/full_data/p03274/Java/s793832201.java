import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n =sc.nextInt();
		int k = sc.nextInt();
		int x[] = new int[n];
		int negnum=0;
		int posnum=0;
		long time1;
		long time2=200000000;

		for (int i=0;i<n;++i){
			x[i]=sc.nextInt();
//			if (x[i]<0) ++negnum;
//			if (x[i]>0) ++posnum;
//			if (x[i]==0) --k;
		}

		for(int i=0;i<=n-k;++i){
			if ((x[i]>0&&x[i+k-1]<0) ||(x[i]<0 && x[i+k-1]>0)){
				time1 = Math.min(2*Math.abs(x[i])+Math.abs(x[i+k-1]), Math.abs(x[i])+2*Math.abs(x[i+k-1]));
			}
			else time1 =Math.max(Math.abs(x[i]),Math.abs(x[i+k-1]));

			time2 = Math.min(time2, time1);
		}

		System.out.println(time2);

	}
}