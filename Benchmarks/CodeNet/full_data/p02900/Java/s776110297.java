import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long count = 0;
        long max = a;
        if(a < b)
            max = b;
        
        for(int i = 2; i*i <= max ; i++){
            if(a % i == 0 && b % i == 0)
                count += 1;
            while(a % i == 0){
                a /= i;
            }
            while(b % i == 0){
                b /= i;
            }
        }
        System.out.println(count+1);
    }
}