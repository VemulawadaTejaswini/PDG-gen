import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n - 1];
        for(int i = 0 ; i < n - 1 ; i++ ){
            b[i] = sc.nextInt();
        }
        for(int i = 1 ; i < n - 1 ; i++ ){
            b[0] += Math.min(b[i - 1] , b[i]);
        }
        sc.close();
        System.out.println(b[0] + b[n - 2]);
    }
}