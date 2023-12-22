import java.util.*;
import java.io.*;
 
public class Main {
 	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] C = new int[N];

		for(int i=0; i<N; i++){
			C[i] = sc.nextInt();
		}

		int ans = count(C, 0);

		System.out.println(ans+1%(1000000007));
	}
	
	static int count(int[] C, int start){
		boolean x = true;
		
		for(int i=start; i<C.length; i++){
			for(int j=i+2; j<C.length; j++){
				if(x==true){
					if(C[i]==C[j]){
						x=false;
						count++;
						count(C, j+1);
					}
				}else{
					x=true;
				}
			}
		}
		
		return count;
	}
}
