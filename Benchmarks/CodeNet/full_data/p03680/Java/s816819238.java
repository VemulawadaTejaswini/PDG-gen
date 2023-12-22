import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean flag = true;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt()-1;
			if(a[i]==1) {
				flag=false;
			}
		}
		if(flag) {
			System.out.println(-1);
			return;
		}
		if(a[a[0]]==0) {
			System.out.println(-1);
			return;
		}
		int count=0;
		int i = 0;
		while(true) {
			
			i = a[i];
			count++;
			if(i==1) {
				System.out.println(count);
				return;
			}
		}
	}
}