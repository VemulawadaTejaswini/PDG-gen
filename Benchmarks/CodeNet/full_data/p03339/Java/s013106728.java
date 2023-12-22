import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		String s=scan.next();

		int[] w =new int [n];
		int[] e =new int [n];
		for (int i=0;i<n;++i){
			if (i==0){
				if(s.charAt(i)=='W'){
					w[i]=1;
				}else{
					w[i]=0;
				}

				if(s.charAt(n-i-1)=='E'){
					e[n-i-1]=1;
				}else{
					e[n-i-1]=0;
				}

			}else{
				if(s.charAt(i)=='W'){
					w[i]=w[i-1]+1;
				}else{
					w[i]=w[i-1];
				}

				if (s.charAt(n-i-1)=='E'){
					e[n-i-1]=e[n-i]+1;
				}else{
					e[n-i-1]=e[n-i];
				}
			}
		}
		int min=Integer.MAX_VALUE;
		for(int i=1;i<n-1;++i){
			min=Math.min(min,w[i-1]+e[i+1]);
		}

		min=Math.min(min,e[1]);
		min=Math.min(min,w[n-2]);

		System.out.print(min);


	}
}
//end