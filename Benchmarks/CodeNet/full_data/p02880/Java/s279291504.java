import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if( N>81 ){
			System.out.println("No");
		}else{
			for( int i=1; i<=9; i++ ){
				if( N%i==0 && N/i<10 ){
					System.out.println("Yes");
					break;                  
				}
				if( i==9 ){
					System.out.println("No");
				}
			}
		}
	}
}
