import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans=200;
		int[] w=new int[n];
		int sum=0;
		for(int i=0; i<n; i++){
			w[i] = sc.nextInt();
			sum+=w[i];
		}
		int pp=0;
		for(int i=0; i<n; i++){
			pp+=w[i];
			ans=Math.min(ans,Math.abs((sum-pp)-pp));
		}
		System.out.println(ans);
	}
}
