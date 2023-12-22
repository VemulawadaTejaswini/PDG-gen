
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println(even_pairs(scn.nextInt(),scn.nextInt()));



    }
    static long even_pairs(int n, int m){
        return combinationOfTwo(n) + combinationOfTwo(m);
    }
    static  long factorial (int n){
       long fact = 1;
       
       if(n == 0){
           return 1;
       }
       if(n < 0){
           return  factorial(-n);
       }
       for (int i = 2; i<=n; i++){
           fact*= i;
       }
       return  fact;
    }
    static long  combinationOfTwo(int n){
        return factorial(n)/(factorial(n-2)*factorial(2));

    }
}
// 2 4 6 8 10 12
