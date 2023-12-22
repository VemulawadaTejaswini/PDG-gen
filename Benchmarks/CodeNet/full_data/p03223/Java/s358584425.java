import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i<n; i++){
			a[i]= sc.nextLong();
		}
		Arrays.sort(a);
		int[] co=new int[n];
		for(int i=0; i<n-1; i++){
			if(i%2==0){
				co[i]--;
				co[i+1]++;
			}else{
				co[i]++;
				co[i+1]--;
			}
		}
		Arrays.sort(co);
		long sum1=0;
		for(int i = 0; i<n; i++){
			sum1+=(long)a[i]*co[i];
		}
		Arrays.fill(co,0);
		for(int i=0; i<n-1; i++){
			if(i%2==0){
				co[i]++;
				co[i+1]--;
			}else{
				co[i]--;
				co[i+1]++;
			}
		}
		Arrays.sort(co);
		long sum2=0;
		for(int i = 0; i<n; i++){
			sum2+=(long)a[i]*co[i];
		}
		System.out.println(Math.max(sum1,sum2));
	}
}
