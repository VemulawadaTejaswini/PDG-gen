import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int[] n =new int[N];
		for(int i=0;i<N;i++) {
			n[i]=sc.nextInt();
		}
		
		int m =0;
		int i=0;
		while(i<N) {
			
			if(n[i]%2==0) {
				n[i]=n[i]/2;
				m++;
			}else {
				i++;
			}
		}
		
		
		System.out.println(m);
	}
}