import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		int k=stdin.nextInt();
		int x=stdin.nextInt();
		int kotae[]=new int[1000000];
		int t=0;
		int j=x-k+1;
//		for(int i=(x-k+1);i<(k*2-1);i++) {
//			kotae[t]=i;
//			j++;
//			t++;
//		}
//		for(int i=0;i<(k*2-1);i++)
//			System.out.print(kotae[i]);
		for(;;) {
			//j=x-k+1;
			kotae[t]=j;

			if(t>=(k*2-1)) break;
			j++;
			t++;
		}
		for(int i=0;i<t;i++) System.out.printf("%d ",kotae[i]);
	}

}
