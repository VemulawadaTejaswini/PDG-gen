import java.io.*;

public class Main{
	StringBuilder sb = new StringBuilder();
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] m = br.readLine().split(" ");
		int n = Integer.parseInt(m[0]);
		int p = Integer.parseInt(m[1]);
		int g = 0,k;
		//int ans;
		long ans;
		m = br.readLine().split(" ");
		int A[] = new int[n];
		for(int i = 0 ; i< n ; i++)
		{
			A[i] = Integer.parseInt(m[i]);
			if(A[i] % 2 == 0) g++ ;
		}
		//System.out.println("偶数の数 : "+g+" 奇数の数 : "+(n-g));
		//System.out.println("偶数の組 : "+kumiG(g)+" 奇数の組 : "+kumiK(n - g));
		
		ans = kumiG(g) * kumiK(n - g);
		if(p == 0){
			System.out.println(ans);
		}else{
			System.out.println(kumiG(n)-ans);
		}
		/*for(int i= 0 ; i<n ; i++){
			System.out.println(A[i]);
		}*/
	}
	public static long kumiG(int mot)
	{
		int i;
		long ans = 0;
		for(i = mot ; i >= 0 ; i--){
			ans += kai(mot)/(kai(i) * kai(mot-i));
			//System.out.println("i = "+i+"の時  kai(mot) = "+kai(mot)+" kai(i) = "+kai(i)+" kai(mot-i) = "+ kai(mot-i));				
		}
		return ans;
	}
	public static long kumiK(int mot)
	{
		int i,j;
		long ans = 0;
		for(i = mot/2 ; i >= 0 ; i--){
			j = i * 2;
			ans += kai(mot)/(kai(j) * kai(mot-j));
		}
		return ans;
	}
	public static long kai(int n){
		if(n == 0) return 1;
		int prod = 1 ;
		for(int j = n  ; j > 0 ; j--){
			prod *= j;
			//if(prod < 0)System.out.println("prod : "+n);
		}
		if(prod == 0)return 1;
		//System.out.println("prod : "+prod);
		return prod;
	}
}