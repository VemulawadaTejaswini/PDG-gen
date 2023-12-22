import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for( int i=1; i<=N; i++ ){
			if( i*108/100==N ){
				System.out.println(i);
				break;
			}
			if( i*108/100>N ){
				System.out.println(":(");
				break;
			}
		}
	}
}
