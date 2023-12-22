import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		int w = sc.nextInt();
		int n = sc.nextInt();
		long count=1;
		long[] a = new long[n];
		for(int i = 0; i<n; i++){
			a[i]=sc.nextLong();
			for(long j = 0; j<a[i]; j++){
				if(count%w==0){
					System.out.println();
				}
				System.out.print(i+1);
				count++;
			}
		}
	}
}