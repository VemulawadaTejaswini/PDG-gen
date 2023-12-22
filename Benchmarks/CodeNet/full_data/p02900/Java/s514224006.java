import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        
        long x = gcd(a, b);
        int count = 1;
        for(int i = 2; i <= Math.sqrt(x); i++){
            if(x%i == 0){
                count++;
                while(x%i == 0){
                    x /= i;
                }
            }
        }
        if(x != 1){
            count++;
        }
        
        System.out.println(count);
    }
    
    private static long gcd(long a, long b){
        
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}