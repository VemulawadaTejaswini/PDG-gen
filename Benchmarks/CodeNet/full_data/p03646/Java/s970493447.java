import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long k=sc.nextLong();
		int n=50;
		long[] a=new long[50];
		Arrays.fill(a,49+k/50);
		System.out.println(50);
		for(int i=0; i<50; i++){
			if(i<k%50){
				a[i]+=51-k%50;
			}else{
				a[i]-=k%50;
			}
			System.out.println(a[i]);
		}
	}
}
