import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        Map<Integer,Integer> numCanPass = new HashMap<>();
        for(int i=1; i<=N; i++){
            numCanPass.put(i, 0);
        }
        for(int i=0; i<M; i++){
            int L = scanner.nextInt();
            int R = scanner.nextInt();
            for(int j=L; j<=R; j++){
                numCanPass.put(j,numCanPass.get(j)+1);
            }
        }
        int numMasterKey = 0;
        for(int i=1; i<=N; i++){
            if(numCanPass.get(i) ==M){
                numMasterKey++;
            }
        }
        System.out.println(String.valueOf(numMasterKey));
    }
}