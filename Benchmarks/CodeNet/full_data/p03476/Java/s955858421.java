import java.util.Scanner;
 
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q=sc.nextInt();
		int[][] queri = new int[Q][2];
		int[] memo = new int[100001];
		for(int i=0;i<Q;i++) {
			queri[i][0]=sc.nextInt();
			queri[i][1]=sc.nextInt();
		}
		for(int i=0;i<Q;i++) {
			int n=queri[i][0];
			int m=queri[i][1];
			int ans=0;
			while(n<=m) {
				if(n%2==1) {
					if(memo[n]>0) {
						ans+=1;
					}
					else if(isPrime(n) && isPrime((n+1)/2)) {
						memo[n]=10;
						ans+=1;
					}
				}
				n+=1;
			}
			System.out.println(ans);
		}
 
		sc.close();
    }
	public static boolean isPrime(int num) {
	    if (num < 2) return false;
	    else if (num == 2) return true;
	    else if (num % 2 == 0) return false; // 偶数はあらかじめ除く
 
	    double sqrtNum = Math.sqrt(num);
	    for (int i = 3; i <= sqrtNum; i += 2)
	    {
	        if (num % i == 0)
	        {
	            // 素数ではない
	            return false;
	        }
	    }
 
	    // 素数である
	    return true;
	}
}