import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in); 
		int n = as.nextInt();
		int[] a;
		a = new int[3*n];
		for(int i=0;i<3*n;i++){
			a[i] = Integer.parseInt(as.next());
		}
		Arrays.sort(a);
		long l = 0;
		for(int i=3*n-2;i>=n;i--){
			l+=a[i];
			i--;
		}
		System.out.println(l);
	}
}