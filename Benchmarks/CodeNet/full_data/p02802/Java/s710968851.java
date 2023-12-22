import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] ac = new String[N+1];
		int[] wa = new int[N+1];
		for( int i=0; i<N+1; i++ ){
			ac[i] = "Q";
		}
		int count1 = 0;      
		for( int i=0; i<M; i++ ){
			int a = sc.nextInt();
			String ss = sc.next();
			if( ss.equals("AC") ){
				ac[a] = "AC";
			}else{
				if( ac[a].equals("Q") ){
					wa[a]++;
				}
			}
		}
		int count2 = 0;      
		for( int i=0; i<N+1; i++ ){
			if( ac[i].equals("AC") ){
				count1++;              
            }else{
				wa[i] = 0;              
            }              
			count2 += wa[i];          
        }          
		System.out.println(count1+" "+count2);
	}
}
