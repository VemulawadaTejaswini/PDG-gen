
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
		
		for (int i = 0; i < a.length; i++) {
			b[a[i]-1]++;
		}
		for (int i = 0; i < b.length; i++) {
			b[i]-=q;
			//System.out.print(b[i]+" ");
			b[i]+=k;
			//System.out.println(b[i]);
		}
		for (int i = 0; i < b.length; i++) {
			if(b[i]>0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
	}

}
