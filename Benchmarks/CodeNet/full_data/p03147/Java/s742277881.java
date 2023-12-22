import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] h = new int [n];

        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            while(h[i] != 0){
                for(int j = i; j < n && h[j] != 0; j++){
                    h[j]--;
                }
                ans++;
            }
        }
        
        System.out.println(ans);

    }
}
