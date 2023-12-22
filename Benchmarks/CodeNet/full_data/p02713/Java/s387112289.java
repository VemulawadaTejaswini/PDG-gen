import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = Integer.parseInt(sc.next());
		
		long sum = 0;
		
		for(int i = 1 ; i < k+1; ++i) {
		    for(int j = 1; j < k+1; ++j) {
		        for(int l = 1; l < k+1; ++l) {
		            int tmp = gcd(i, gcd(j, l));
		            sum += tmp;
		        }
		    }
		} 
		
		System.out.println(sum);
	}
	
	public static int gcd(int num1,int num2) {
    if(num2==0) return num1;
    else return gcd(num2,num1%num2);
	}
   
}