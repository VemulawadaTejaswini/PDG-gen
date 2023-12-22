import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long L = sc.nextLong();
		long R = sc.nextLong();
		long ans = 0;
		long minium = 2019;
		if( R-L < 2019 ){
			loop:for( long i=L; i<=R-1; i++ ){
				for( long j=i+1; j<=R; j++ ){
					ans = ((i%2019L)*(j%2019L))%2019L;
					minium = Math.min(ans,minium);
					if( minium==0 ){
						break loop;
					}
				}
			}
		}else{
			minium = 0;
		}
		System.out.println(minium);
	}
}
