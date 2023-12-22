import java.util.*;
 
public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N,A,B,C,D,E;
		N=sc.nextInt();
		long min=1000000000000000;
		for(int i=0;i<5;i++){
			int m = sc.nextInt();
			if(m<min)min=m;
		}
		System.out.print(N/m+4);
	}
}