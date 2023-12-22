import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scn =new Scanner(System.in);
		int N=scn.nextInt();
		int T=scn.nextInt();
		int A=scn.nextInt();
		double[] H=new double[N];
		int ans=0;
		int[] temp=new int[N];
		for(int i=0;i<N;i++){
			H[i]=scn.nextInt();
			temp[i]=(int) (T-H[i]*0.006);
			if(H[ans]<=temp[i]&&temp[i]<A||A<temp[i]&&temp[i]<=H[ans]){
				ans=i+1;
			}
		}
		System.out.println(ans +" "+temp+" "+H[0]);

	}
}
