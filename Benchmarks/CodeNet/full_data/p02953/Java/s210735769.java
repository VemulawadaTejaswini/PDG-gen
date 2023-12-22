import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] a = new long[N];
		for( int i=0; i<N; i++ ){
			a[i] = sc.nextLong();
		}
		long maxium = a[0];
		for( int i=1; i<N; i++ ){
			if( maxium - a[i] >=2 ){
				System.out.println("No");
				break;
			}else{
				maxium = Math.max(maxium,a[i]);
			}
			if( i==N-1 ){
				System.out.println("Yes");
			}
		}
		if( N==1 ){
			System.out.println("Yes");          
        }          
	}
}
