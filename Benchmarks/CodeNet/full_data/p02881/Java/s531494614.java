import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long x = n;
		long y = n;
		
		for(long i=1;i<(long)Math.sqrt(n)+1;i++){
		    if(n%i==0){
		        if(i+(n/i)<x+y){
		            x = i;
		            y = n/x;
		        }
		    }
		}

		long ans = x+y-2;

        System.out.println(ans);
	}
}
