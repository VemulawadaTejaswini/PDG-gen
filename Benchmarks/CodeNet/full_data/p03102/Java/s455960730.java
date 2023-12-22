import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c = sc.nextInt();
		int[] b1=new int[m];
		int ans=0;
		for(int i = 0; i<m; i++){
			b1[i]=sc.nextInt();
		}
		for(int i = 0; i<n; i++){
			int sum=c;
			for(int j=0; j<m; j++){
				sum+=b1[j]*sc.nextInt();
			}
			if(sum>0){
				ans++;
			}
		}
		System.out.println(ans);
	}
}