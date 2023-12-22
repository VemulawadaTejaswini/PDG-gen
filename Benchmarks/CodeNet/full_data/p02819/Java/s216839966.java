import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		loop:for( int i=X; i<=X*2; i++ ){
          if( i==2 ){
					System.out.println(i);
 					break loop;                 
                } 
			for( int j=2; j*j<=i; j++ ){                
				if( i%j==0 ){
					break;
				}
				if( (j+1)*(j+1)>i ){
					System.out.println(i);
					break loop;
				}
			}
		}
	}
}
