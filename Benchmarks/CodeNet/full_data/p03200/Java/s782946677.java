import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(a[i] > 18) {
				a[i]=18;
			}
		}
		int[] b = new int[18];
		int[] b_temp = new int[18];
		int b_max = 0;
		for(int j=0;j<18;j++) {
			b[j] = 0;
			b_temp[j] = 0;
		}
		
		b_max = a[0];
		for(int j=0;j<a[0];j++) {
			b_temp[j] = 1;
		}
		for(int i=1;i<n;i++) {
			if(a[i]>b_max) {
				for(int j=b_max;j<a[i];j++) {
					b_temp[j] = 1;
				}
				b_max = a[i];
			}else {
				b_temp[a[i]-1]++;
				for(int j=a[i];j<b_max;j++) {
					if(b_temp[j] > b[j]) {
						b[j] = b_temp[j];
					}
					b_temp[j] = 0;
				}
				b_max = a[i];
			}
		}
		int max = 0;
		for(int j=0;j<18;j++) {
			if(b_temp[j] > b[j]) {
				b[j] = b_temp[j];
			}
			if(max<b[j]) {
				max=b[j];
			}
				
		}
		int count=0;
		for(int i=1;i<max;i=i*2) {	
			count++;
		}
		if(max == 2) {
			count=2;
		}
		
		System.out.println(max);
	}
}