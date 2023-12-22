import java.util.*;
public class B4 {
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int [] a = new int [n];
		for(int i=0;i<n;i++){
			a[i] = stdIn.nextInt();
		}
		int [] b = new int [n];
		int [] c = new int [n];
		
		for(int i=1;i<=n;i++){
			b[i-1] = a[i-1];
			for(int j=0;j<i;j++){
				c[j] = b[i-j-1];
			}
			for(int j=0;j<i;j++){
				b[j] = c[j];
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.print(b[i]+" ");
		}
	}
	
}
