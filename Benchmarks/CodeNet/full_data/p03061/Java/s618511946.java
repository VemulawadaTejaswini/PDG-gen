import java.util.*;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int input = sc.nextInt();
		//ArrayList<Integer> n= new ArrayList<Integer>();
		int n[] = new int [input];
		for (int i=0 ; i<input ; i++ ){
			int v = sc.nextInt();
			n[i]=v;
			}
		
		int L[] = new int [input+2];
		int R[] = new int [input+2];
		
		L[0]=0;
		R[input+1]=0;
		
		for (int i=0 ; i<input ; i++){
				L[i+1]=gcd(L[i],n[i]);
				R[input-i-1]=gcd(R[input-i],n[input-1-i]);
		}
		
		int max = 0;
		for (int i=0 ; i<input ; i++){
			int mi = gcd(L[i],R[i+1]); 
			if(mi>max){
				max = mi;
			}	
		}
		System.out.println(max);
	}



	public static int gcd(int a,int b){
		if(b==0) return a;
		else {
			int c = a%b;
			return gcd(b,c);
		}
	}

}