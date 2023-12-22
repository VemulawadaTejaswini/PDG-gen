import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] aa=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			aa[i]=a[i];
		}
		Arrays.sort(aa);
		int flag2 = 0;
		for(int i=1;i<n;i++) {
			if(aa[i] == aa[i-1]) {
				flag2=1;
			}
		}
		if(flag2==0) {
			System.out.println(1);
			System.exit(0);
		}
		for(int i=0;i<n;i++){
			if(a[i] > 18) {
				a[i]=18;
			}
		}
		int max = 1;
		int[] b =new int[18];
	while(true) {
		int flag = 0;
		
		for(int i=0;i<18;i++){
			b[i] = 0;
		}
		
		//1番目
		for(int i=0;i<a[0];i++) {
			b[i]=1;
		}
		
		for(int i=1;i<n;i++) {
			b[a[i]-1]++;
			for(int j=18;j>0;j--) {
				if(j>a[i]) {
					b[j-1] = 0;
				}else if(b[j-1]==0){
					b[j-1]=1;
				}
				if(b[j-1] > max) {
					if(j != 1) {
						b[j-2]++;
						b[j-1] = 1;
					}else {
						max++;
						flag = 1;
						break;
					}
				}
			}
			if(flag==1) {
				break;
			}
		}
		if(flag==0) {
			break;
		}
		
	}
		
		System.out.println(max);
	}
}

