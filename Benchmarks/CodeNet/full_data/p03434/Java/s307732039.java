import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        int N = sc.nextInt();
		int[] a = new int[100];
		for (int i=0; i <N; i++)
			a[i]=sc.nextInt();
		
		Arrays.sort(a);	
		
		int Alice = 0;
		int Bob = 0;

		for (int i=99; i >99-N; i--)
			if ( i % 2 == 1 )
			   Alice += a[i];
			else 
			Bob +=a[i];
			
		System.out.println( Alice - Bob );
	}
}