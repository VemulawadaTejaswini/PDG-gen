import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] aflag=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			aflag[i] = 0;
		}
		Arrays.sort(a);
		int b = n;
		int c = n-1;
		int count = 0;
		for(int max = 1073741824;max>1;max = max/2) {
			for(int i=n-1;i>=0;i--) {
				//System.out.println(max);
				if(a[i] >= max) {
					continue;
				}
				if(aflag[i] == 1) {
					continue;
				}
				if(a[i] * 2 < max) {
					break;
				}
				for(int j=0;j<n-1;j++) {
					if(a[j] > max / 2) {
						c = i;
						break;
					}
					if(aflag[j] != 1) {
						if(a[i] + a[j] == max) {
							count++;
							aflag[i] = 1;
							aflag[j] = 1;
							break;
						}
					}
				}
			}
		}
		
		System.out.println(count);
	}
}