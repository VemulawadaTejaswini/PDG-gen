import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] V = new int[N];
        
        for(int i = 0; i < N; i++){
            V[i] = sc.nextInt();
        }
        
        int gemScoreMax = 0;
        for(int l = 0; l <= K; l++){
            for(int r = 0; r <= K - l; r++){
                
                if( l + r > N ) break;
                
                List<Integer> takenOutGems = new ArrayList<>();
                int gemScore = 0;
                
                for(int i = 0; i < l; i++){
                    gemScore += V[i];
                    takenOutGems.add(V[i]);
                }
                
                for(int i = 0; i < r; i++){
                    gemScore += V[N-1-i];
                    takenOutGems.add(V[N-1-i]);
                }
                
                Collections.sort(takenOutGems);
                
                int canDeleteNum = K - l - r;
                for(int i = 0; i < canDeleteNum; i++){
                    if ( i >= takenOutGems.size() ) break;
                    if ( takenOutGems.get(i) > 0 ) break;
                    gemScore -= takenOutGems.get(i);
                }
                
                gemScoreMax = Math.max(gemScoreMax, gemScore);
                
            }
        }
        
        System.out.println(gemScoreMax);
    }
}
