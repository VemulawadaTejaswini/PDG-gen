import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        String S = scanner.next();
        
        char[] T = new char[N];
        HashSet<String> set = new HashSet<String>();
        String ans;
        
        for(int i=0; i<N; i++){
            T[i] = S.charAt(i);
        }
        
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    ans = T[i]+""+T[j]+""+T[k];
                    set.add(ans);
                }
            }
        }
        
        System.out.println(set.size());
        
    }
}
