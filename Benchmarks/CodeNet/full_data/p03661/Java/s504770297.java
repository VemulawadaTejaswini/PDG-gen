import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
		
		long sunuke = 0;
		long arai = 0;
		long Min,Min0=0;
		long sum=0;
		Scanner sc =new Scanner(System.in);
		String Ns = sc.nextLine();
		int N = Integer.parseInt(Ns);
		String[] a = new String[N];
		String line = sc.nextLine();
		a = line.split(" ");
		
		long[] ia = new long[N];
		for(int j =0;j<N;j++){
		ia[j] = Long.parseLong(a[j]);
		sum = ia[j] + sum;
		}
		

		for(int i=0;i<N-1;i++){ 
			
			sunuke = ia[i] + sunuke;
			arai = sum - sunuke;			
			long sa = Math.abs(sunuke-arai);
			if(i==0){Min0 = sa;}
			Min = Math.min(Min0,sa);
			//if(Min==sa){Indexi = i;Indexj = j;}
			Min0 = Min;			
		}System.out.println(Min0);
		sc.close();
	}
}