import java.util.Scanner;

public class Main {
   static long ans = 0;
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long a = function(sc.nextLong());
        System.out.println(a);
    }
    private static long function(long n){
       
        if(n<2)
            return ans;
        else{
            if(n%10 == 0){
                ans++;
                return function(n-2);
            }else{
                return function(n-2);
            }
        }
    }
}