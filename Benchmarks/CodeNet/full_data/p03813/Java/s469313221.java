  import java.util.*;
public class Main {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		long x=sc.nextLong();
		long n=(long)x/11;
		long m=x%11;
		long result=0;
		if(m==0){
			result=2*n;
		}
		else{
			if(m<=6){
			result=2*n+1;
			}
		else{
			result=2*n+2;
			}
		}
		System.out.println(result);
	}

}