import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();
        long ans = 0;
              
        
        for(long M = N+1; M >= K; M--){
        long plus = (M * (N-M+1) + 1) % 1000000007;
        System.out.println(plus);
        ans = ans + plus;
        ans = ans % 1000000007;
        }
        
        System.out.print(ans);
	}
}