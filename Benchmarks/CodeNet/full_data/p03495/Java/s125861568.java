import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] h=new int[200001];
		for(int i=0;i<n;i++) {
			h[sc.nextInt()]++;
		}
		Arrays.sort(h);
		int ans=0;
		for(int i=0;i<h.length;i++) {
			if(k<=0) {
				break;
			}else if(h[i]==0) {
				continue;
			}
			ans++;
			k-=h[i];
		}
		System.out.println(ans);
	}
}
