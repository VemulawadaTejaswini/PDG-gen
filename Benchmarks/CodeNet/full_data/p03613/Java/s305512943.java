import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N+1];
		for( int i=1; i<=N; i++ ){
			A[i] = sc.nextInt();
		}
		Arrays.sort(A);
		A[0] = 100004;      
		int count = 1;
		int a = N;
		int b = N-1;
		int ans = 0;
		int n = 0;
		for( int i=0; i<N-1; i++ ){            
			if( A[a] - A[b] >2 ){
				a--;
				b--;     
				if( a<2 ){
					break;                  
                }                  
            }              
			if( A[a] - A[b] <=2 ){              
				count++;
				b--;           
				if( Math.abs(A[a] - A[b]) >2 ){
					ans = Math.max(ans,count);               
					count = 1;
					a = b+1;
					b = a-1;
				}
				if( a<=2 ){
					break;                  
                }                  
			}
		}      
		if( N==1 || ans==0 ){
			ans = 1;          
        }          
		System.out.println(ans);
	}
}
