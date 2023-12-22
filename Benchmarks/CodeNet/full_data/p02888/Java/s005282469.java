import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ll = new int[n];
        for(int i = 0; i < n; i++){
            ll[i] = sc.nextInt();
        }
        Arrays.sort(ll);
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int max2 = Math.max(ll[i], ll[j]);
                for(int k = j+1; k < n; k++){
                    int max3 = Math.max(max2, ll[k]);
                    if(ll[i] + ll[j] + ll[k] - max3 > max3) ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
