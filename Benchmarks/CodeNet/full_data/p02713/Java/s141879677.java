
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		long s=0;
		for(int a=1;a<k+1;a++){
		for(int b=1;b<k+1;b++){
		for(int c=1;c<k+1;c++){
			s+=gcd(gcd(a,b),c);
		}
		}
		}
		System.out.println(s);
	}
	public static int gcd(int a, int b){
    		if(b==0) return a;
    		return gcd(b, a%b);
	}
}