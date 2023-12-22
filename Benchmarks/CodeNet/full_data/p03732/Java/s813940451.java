import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int W = scanner.nextInt();

        ArrayList<ArrayList<Integer>> meta = new ArrayList<>();

        meta.add(new ArrayList<Integer>());
        meta.add(new ArrayList<Integer>());
        meta.add(new ArrayList<Integer>());
        meta.add(new ArrayList<Integer>());

        meta.get(0).add((int)1e9);
        meta.get(1).add((int)1e9);
        meta.get(2).add((int)1e9);
        meta.get(3).add((int)1e9);


        int W0 = scanner.nextInt();
        int V0 = scanner.nextInt();

        meta.get(0).add(V0);

        for(int i=1; i<N; i++){
            int w = scanner.nextInt() - W0;
            int v = scanner.nextInt();

            meta.get(w).add(v);
        }


        Collections.sort(meta.get(0), Collections.reverseOrder());
        Collections.sort(meta.get(1), Collections.reverseOrder());
        Collections.sort(meta.get(2), Collections.reverseOrder());
        Collections.sort(meta.get(3), Collections.reverseOrder());

        int accV0 = 0;
        int accW0 = 0;

        int ans = 0;

        for(int v0: meta.get(0)){

            if(v0 != (int)1e9) {
                accV0 += v0;
                accW0 += W0;
            }

            int accV1 = 0;
            int accW1 = 0;
            for(int v1: meta.get(1)){
                if(v1 != (int)1e9) {
                    accV1 += v1;
                    accW1 += W0 + 1;
                }

                int accV2 = 0;
                int accW2 = 0;
                for(int v2: meta.get(2)){
                    if(v2 != (int)1e9) {
                        accV2 += v2;
                        accW2 += W0 + 2;
                    }

                    int accV3 = 0;
                    int accW3 = 0;
                    for(int v3: meta.get(3)){

                        if(v3 != (int)1e9) {
                            accV3 += v3;
                            accW3 += W0 + 3;
                        }

                        if(accW0 + accW1 + accW2 + accW3 <= W){
                            ans = Math.max(ans, accV0 + accV1 + accV2 + accV3);
                        }
                    }
                }
            }
        }

        System.out.println(ans);

    }
}
