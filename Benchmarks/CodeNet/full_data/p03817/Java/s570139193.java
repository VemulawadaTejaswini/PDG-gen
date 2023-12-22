import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long a = 0;
		if( N%11<=6 && N%11>0 ){
			a = 1;
		}
		if( N%11>6 ){
			a = 2;
		}
		System.out.println(N/11*2+a);
	}
}
