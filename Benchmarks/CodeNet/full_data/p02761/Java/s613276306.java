import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[n];
        Arrays.fill(x, -1);
        String ans = "";
        int flg = 0;
        
        for(int i=0; i<m; i++){
            int s = sc.nextInt();
            int c = sc.nextInt();
            
            if(x[s-1] == -1){
                x[s-1] = c;
            }
            else if(x[s-1] == c){
                // none
            }
            else{
                System.out.println(-1);
                flg = 1;
                break;
            }
        }
        
        if(flg == 0){
            for(int j=0; j<n; j++){
                if(x[j] != -1){
                    ans += x[j];
                }
                else{
                    ans += 0;
                }
            }
            
            if(String.valueOf(Integer.parseInt(ans)).length() < n){
                System.out.println(-1);
            }
            else{
                System.out.println(Integer.parseInt(ans));
            }
        }
    }
}