import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		for( int i=0; i<N; i++ ){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		long ans = 0;      
		if( N%2==1 ){
			if( N==1 && a[0]==0 ){
				ans = 1;              
            }           
			for( int i=1; i<N; i+=2 ){
				if( a[i]!=a[i+1] && a[i]!=i+1 ){
					ans = 0;		
					break;
				}      
				if( i==N-2 && a[0]==0 ){
					ans = 2;
					for( int j=0; j<N/2-1; j++ ){
						ans = 2*ans;
							ans = ans%1000000007L; 
					}             
				}
			}  
		}
		if( N%2==0 ){
			for( int i=0; i<N; i+=2 ){
				if( !( a[i]==a[i+1] && a[i]==i+1 ) ){
					ans = 0;
					break;
				}
				if( i==N-2 ){
					ans = 2;
					for( int j=0; j<N/2-1; j++ ){
						ans = 2*ans;
							ans = ans%1000000007L;
					}                 
				}
			}
		}  
		System.out.println(ans);
	}
}
