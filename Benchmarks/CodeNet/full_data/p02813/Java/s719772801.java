import java.util.Scanner;
import Math;
public class Main {

    public static int fact(int n){
        int ans = 1;
        while(n != 0){
            ans *= n;
            n--;
        }
        return ans;
    }

    public static int func(int[] a,int num){
        int ans = 0;
        for(int i = 0; i < a.length ; i++){
            ans += fact(num-(i+1))*(a[i]-1);
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int in_num = Integer.parseInt(sc.next());
        int[] p = new int[in_num];
        int[] q = new int[in_num];
        for(int i = 0 ; i < in_num ; i++){
            p[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0 ; i < in_num ; i++){
            q[i] = Integer.parseInt(sc.next());
        }
        System.out.println(Math.abs(func(p,in_num)-func(q,in_num)));
    }
}