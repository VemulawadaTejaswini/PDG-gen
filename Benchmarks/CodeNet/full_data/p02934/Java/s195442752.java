import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		int n=st.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=st.nextInt();
		}
		double kotae=0;
		for(int i=0;i<n;i++) {
			kotae+=1.0/(double)a[i];
		}
		double kotae1=0.0;
		kotae1=1.0/kotae;
		System.out.printf("%f",kotae1);

	}

}
