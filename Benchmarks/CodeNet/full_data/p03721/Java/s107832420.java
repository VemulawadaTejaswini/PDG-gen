import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] aa=new int[100001];
		int[] bb = new int[n];
		int sum = 0;
		for(int i = 0; i < n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			aa[a]=b;
			bb[i]=a;
		}
		Arrays.sort(bb);
		for(int i = 0; i<n; i++){
			sum+=aa[bb[i]];
			if(sum>=k){
				System.out.println(bb[i]);
				return;
			}
		}
	}
}