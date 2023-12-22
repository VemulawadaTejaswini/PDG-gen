import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		if(a>b){
			System.out.println(0);
		}else if(n==1){
			if(a==b){
				System.out.println(0);
			}else{
				System.out.println(1);
			}
		}else{
			System.out.println((b*(n-1)+a)-(a*(n-1)+b)+1);
		}
		return;
	}
}