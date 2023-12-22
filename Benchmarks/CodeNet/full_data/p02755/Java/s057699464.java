import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int aa = 0;
		int bb = 0;
		for( int i=10; i<=1009; i++ ){
			if( i/10==B ){
				bb = i;
				break;
			}
		}
		for( int i=bb/10*10; i<=bb/10*10+9; i++  ){
			if( i*8/100==A ){
				System.out.println(i);
				break;
			}
			if( i==bb/10*10+9 ){
				System.out.println(-1);
			}
		}
	}
}
