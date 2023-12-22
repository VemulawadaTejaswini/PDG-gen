
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int q=s.nextInt();
		int[] a=new int[q];
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		int[] b=new int[n];
		for (int i = 0; i < b.length; i++) {
			b[i]=k;
		}
		
		for (int i = 0; i < a.length; i++) {
			//System.out.println(a[i]);
			for (int j = 0; j < n; j++) {
				if(a[i]==(j+1)) {
					//System.out.println("YES");
					
				}
				else {
					b[j]--;
				}
			}
//			for (int j = 0; j < b.length; j++) {
//				System.out.print(b[j]+" ");
//			}
			//System.out.println();
		}
		for (int i = 0; i < b.length; i++) {
			//System.out.println(b[i]);
			if(b[i]<=0) {
				System.out.println("No");
			}
			else
			{
				System.out.println("Yes");
			}
		}
	}

}
