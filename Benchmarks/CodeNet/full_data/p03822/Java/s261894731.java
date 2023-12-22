import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		int n=as.nextInt();
		int[] a,b;
		a = new int[n];
		b = new int[n];
		for(int i=1;i<n;i++){
			a[i] = Integer.parseInt(as.next()); 
		}
		int l = 0;
		int k = 0;
		int t = 0;
		int x = 0;
		for(int i=1;i<n;i++){
			if(a[i]==1){
				x++;
				b[i] = 0;
				continue;
			}
			t = i;
			for(int s=0;s<n;s++){
				if(a[t]==1){
					l = Math.max(l, k);
					b[i] = k;
					k = 0;
					break;
				}else{
					t = a[t]-1;
					k++;
				}
			}
		}
		int q = 0;
		for(int i=1;i<n;i++){
			if(b[i]==l){
				q++;
			}
		}
		System.out.println(Math.max(x,l+q));
	}
}