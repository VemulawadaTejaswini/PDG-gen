import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        for(int i = 0; i < m; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        sc.close();
        
        int ans = 0;
        int[] count = new int[n];
        Arrays.fill(count, 0);
        for(int i = l[0]; i <= r[0]; i++){
            if(m == 1){
                count[i] = 0;
            }
            else{
                for(int j = 1; j < m; j++){
                    if(i >= l[j] && i <= r[j]){
                        count[i] += 1;
                    }
                }
            }
            if(count[i] == m-1){
                ans += 1;
            }
        }
        
        System.out.println(ans);
        
    }
}
