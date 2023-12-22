import java.util.*;
        public class Main {
        	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long x=n/k;
		if(Math.abs(n-x*k)<Math.abs(n-(x+1)*k)){

			System.out.print(Math.abs(n-x*k));
		}else{
			System.out.print(Math.abs(n-(x+1)*k));
		}
	}
        }