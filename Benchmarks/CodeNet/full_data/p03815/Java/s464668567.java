import java.util.*;
public class Main {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
			
			long x=sc.nextLong();
	long rem=x%11;
	long ans=x/11*2;
	if(rem==0) {
		System.out.println(ans);
	}else {
		if(rem<=6) {
			System.out.println(ans+1);
		}else {
			System.out.println(ans+2);
		}
	}
			System.out.println(++ans);
			
			
	}
}