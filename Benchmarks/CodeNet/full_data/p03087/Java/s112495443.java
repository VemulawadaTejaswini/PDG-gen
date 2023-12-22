import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();

        int[] count = new int[N+2];
        for(int i = 0; i< N+2; i++) count[i] = 0;
        
        for(int i = 0; i< N-1; i++){
            String Ssub = S.substring(i, i+2);
            if(Ssub.equals("AC")){
                count[i+1] = count[i] + 1;
            }else{
                count[i+1] = count[i];
            }
        }

        int ans = 0;
        for(int i = 0; i < Q; i++){
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            ans = count[r] - count[l];
            System.out.println(ans);
        }
    }
}
