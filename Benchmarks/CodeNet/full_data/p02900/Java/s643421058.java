import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int count = 1;
        
        long gcdab = gcd(a,b);

        for(int i = 2; i*i <= gcdab ; i++){
            if(gcdab % i == 0)
                count += 1;
            while(gcdab % i == 0){
                gcdab /= i;
            }
        }
        if(gcdab != 1)
            count += 1;

        System.out.println(count);
    }

    private static long gcd(long a,long b){
        if(b == 0)
            return a;
        else
            return gcd(b,a % b);
    }
}