import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] a = new int[(int)Math.pow(10, 9)];
		int count = 0;
		for(int i=0 ; i<N ;i++) {
			int x = stdIn.nextInt();
			if(a[x]==0) {
				a[x] = 1;	
				count++;
			}else {
				a[x] = 0;
				count--;
			}
		}
		System.out.println(count);
	}
}
