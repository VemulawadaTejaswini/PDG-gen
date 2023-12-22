import java.util.*;
import java.util.Arrays;
public class Main{
    private static int euclid(int m, int n) {
        if(n==0){
            return m;
        }
        else{
            return euclid(n, m%n);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
 
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                for(int k = 1; k <= n; k++) {
                    result += euclid(j,euclid(k,i));
                }
            }
        }
        System.out.println(result);
    


    }
}