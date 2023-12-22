import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        String[] S = new String[N];
        for(int i=0;i<N;i++){
            S[i] = sc.next();
        }
        
        for(int i=0;i<N-1;i++){
            String s1 = S[i];
            String s2 = S[i+1];
            if(s1.compareTo(s2)>0){
                S[i] = s2;
                S[i+1] = s1;
            }
        }
        
        StringBuilder str = new StringBuilder();
        for(int i=0;i<N;i++){
            str.append(S[i]);
        }
        
        System.out.println(new String(str));
        
    }
}
