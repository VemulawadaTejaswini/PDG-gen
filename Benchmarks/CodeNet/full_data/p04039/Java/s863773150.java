import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void getPermutation(boolean[] D, int level, int curr, List<Integer> permutation){
        if(level == 6){
            return;
        }
        permutation.add(curr);

        for(int i = 0; i < 10; i++){
            if(D[i]){
                continue;
            }
            getPermutation(D, level + 1, curr * 10 + i, permutation);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        boolean[] D = new boolean[10];
        for(int i = 0; i < K; i++){
            int d = sc.nextInt();
            D[d] = true;
        }

        int ans = Integer.MAX_VALUE;
        List<Integer> permutation = new ArrayList<>();
        getPermutation(D, 0, 0, permutation);
        for(int v : permutation){
            if(v >= N){
                ans = Math.min(ans, v);
            }
        }

        System.out.println(ans);
    }
}
