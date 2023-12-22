
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = N;
        int ans = 0;
        
        while(n > 0) {
        	 ans += n%10;
        	 n /= 10;
        }
        System.out.println(N%ans == 0?"YES":"NO");
    }
}