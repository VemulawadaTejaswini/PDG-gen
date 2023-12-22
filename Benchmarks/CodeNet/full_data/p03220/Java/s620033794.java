import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scn =new Scanner(System.in);
		int N=scn.nextInt();
		int T=scn.nextInt();
		int A=scn.nextInt();
		double[] H=new double[N];
		int ans=0;
		double[] temp=new double[N];
		for(int i=0;i<N;i++){
			H[i]=scn.nextInt();
			temp[i]=T-H[i]*0.006;
			if(temp[ans]<=temp[i]&&temp[i]<=A||A<=temp[i]&&temp[i]<=temp[ans]){
				ans=i+1;
			}
		}
		if(ans==0)ans++;
		System.out.println(ans);

	}
}
