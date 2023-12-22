import java.util.*;

public class Main {
    static int gcd (int a, int b) {
    	int temp;
    	while((temp = a%b)!=0) {
    		a = b;
    		b = temp;
    	}
    	return b;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int g = gcd(N,M);
        int result =1;
        String S = sc.next();
        String T = sc.next();
        for(int i = 0; i < g; i++){
            if(!(S.substring(N/g*i,N/g*i+1).equals(T.substring(M/g*i,M/g*i+1)))){
                result = -1;
            }
        }
        if(result>0)System.out.println(N*M/g);
        else System.out.println(-1);
    }
}
