import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int count = 0;
        long x, y, gcd;
        
        if(a > b){
            x = a;
            y = b;
        }else{
            x = b;
            y = a;
        }
        long temp = -1;
        while(temp != 0){
            temp = x % y;
            x = y;
            y = temp;
        }
        gcd = x;

        for(int i = 2; i <= gcd ; i++){
            if(gcd % i == 0)
                count += 1;
            while(gcd % i == 0){
                gcd /= i;
            }
        }
        if(gcd != 1)
            count += 1;

        System.out.println(count);
    }
}