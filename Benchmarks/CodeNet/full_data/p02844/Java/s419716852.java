import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();
		int[] count = new int[10];
		for( int i=0; i<N; i++ ){
			char ch = S.charAt(i);
			String str = String.valueOf(ch);
			int a = Integer.parseInt(str);
			count[a]++;
		}
		int dis = 0;
		for( int i=0; i<=9; i++ ){
			if( count[i]==2 ){
				dis += (count[i]-1);
			}
			if( count[i]==3 ){
				dis += (count[i]-1) + (count[i]*(count[i]-1)/2-1);
			}
			if( count[i]>=4 ){
				dis += (count[i]-1) + (count[i]*(count[i]-1)/2-1) + (count[i]*(count[i]-1)*(count[i]-2)/6-1);
			}
		}
		System.out.println( N*(N-1)*(N-2)/6-dis );
	}
}
