import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();
        
        long min = Math.min(A, B);
        long max = Math.max(A, B);
        long limit = (long)Math.sqrt(min);
        long count = 1;

        for(long i = 2; i <= limit; i++){
            if(min%i == 0){
                while(min%i == 0){
                    min /= i;
                }
                if(max%i == 0)
                    count++;
            }
        }
        if(count == 1 && min == Math.min(A, B)){
            if(B%A == 0 || A%B == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}