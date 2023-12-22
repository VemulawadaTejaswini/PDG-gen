import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] W = new String[N];
        String ans = "Yes";
        for(int i = 0; i < N; i++){
            W[i] = sc.next();
            for(int j = 0; j < i; j++){
                if(W[j].equals(W[i])){
                    ans = "No";
                }
            }
        }
        for(int i = 1; i < N; i++){
            if(W[i-1].charAt(W[i-1].length() - 1 ) != W[i].charAt(0)){
                ans = "No";
            }
        }
        System.out.println(ans);
        
    }
}
