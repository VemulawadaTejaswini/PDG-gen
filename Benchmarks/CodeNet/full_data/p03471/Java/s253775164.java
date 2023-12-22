import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Y = sc.nextInt();
		for( int x=0; x<=N; x++ ){
			for( int y=N-x+1; y>=0; y-- ){
				for( int z=0; z<=N-x+1; z++ ){
					if( 10000*x + 5000*y + 1000*z == Y ){
						System.out.println(x+" "+y" "+z);
					}
				}
			}
			if( x==N ){
				System.out.println("-1 -1 -1");
			}
		}
	}
}
