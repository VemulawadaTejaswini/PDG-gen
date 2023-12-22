import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int a = K;
        int b = K;
        int c = K;
      	int sum = 0;
      
        for (int A=1; A<=a; A++) {
			for (int B=1; B<=b; B++) {
				for (int C=1; C<=c; C++) {
					int t1 = gcd(A,B);
                  	int t2 = gcd(t1,C);
                  	sum += t2;
				}
			}
        } 
        System.out.println(sum);
    }
  
private static int gcd(int m, int n) {
    while (n > 0)
    {
        int temp = n;
        n = m % n; // % is remainder
        m = temp;
    }
  	return m;
}
}

