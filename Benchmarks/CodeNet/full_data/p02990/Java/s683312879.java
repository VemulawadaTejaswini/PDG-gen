import java.util.*;
public class Main {
   	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
        long mod = 1000000007;
        long [] [] pascal = new long [2001][2001];
        for(int i=0;i<=2000;i++){
        for(int j=0;j<=i;j++){if(j==0 || j==i){pascal[i][j]=1;}
                             else{pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];}
                             }
        }
        for(int i=1;i<=k;i++){long a = pascal[k-1][i-1]%mod;
                              long b = pascal[n-k+1][i]%mod;
          System.out.println((a*b)%mod);}		
	}
}
