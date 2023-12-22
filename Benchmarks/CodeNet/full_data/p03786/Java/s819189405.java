import java.util.Arrays;
import java.util.Scanner;
public class Main{
	static Scanner s = new Scanner(System.in);
	static int n,a[];
	public static void main(String[] args) {
		n = s.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++) a[i]=s.nextInt();
		Arrays.sort(a);
		int last=a[n-1];

		long sum=0,length,result=1;
		for(int i=0;i<n-1;i++) {
			sum+=a[i];
			length=sum;
			for(int j=i+1;j<n;j++) {
				if(length*2>=last) {
					result++;
					break;
				}
				if(length*2>=a[j]) {
					length+=a[j];
				}else {
					break;
				}
			}
		}
		System.out.println(result);
	}
}