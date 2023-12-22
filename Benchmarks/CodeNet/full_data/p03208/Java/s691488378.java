import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int h[] = new int[n];
        int result = 1000000000;
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        for(int i = 0;i<n-(k-1);i++){
            int minh = h[i];
            int maxh = h[i+(k-1)];
            int sah = maxh - minh;
            if(sah<result){
                result = sah;
            }
        }
        System.out.println(result);
        sc.close();
    }
}