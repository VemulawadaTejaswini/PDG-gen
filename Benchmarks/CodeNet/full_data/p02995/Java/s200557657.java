import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		long E = 0;
		for( long i=1; i<=C; i++ ){
			if( (D*i)%C==0 ){
				E = D*i;
				break;
			}
		}
		System.out.println( (B-A+1) - (B/C+B/D-B/E) + ((A-1)/C+(A-1)/D-(A-1)/E) );     
	}
}
