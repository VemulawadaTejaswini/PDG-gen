import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        sc.close();
        boolean aa = true;
        int s = -1;
        while(aa == true){
            s++;
            if(s + 1 == n){
                aa = false;
            }
            if(h[s] >= k){
                aa = false;
            }
        }
        if(s + 1 == n){
            s++;
        }
        System.out.println(n - s);
    }
}