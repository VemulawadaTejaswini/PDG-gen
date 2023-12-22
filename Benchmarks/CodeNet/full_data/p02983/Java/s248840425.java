import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long l=sc.nextLong();
		long r=sc.nextLong();
		long min=Long.MAX_VALUE;
		if((l%2019)>(r%2019) || l==2019){
			System.out.println(0);
		}else{
			for(long i=l; i<=r; i++){
				for(long j=i+1; j<=r; j++){
					min=Math.min(min,((i%2019)*(j%2019))%2019);
				}
			}
		}
		System.out.println(min);
	}
}


