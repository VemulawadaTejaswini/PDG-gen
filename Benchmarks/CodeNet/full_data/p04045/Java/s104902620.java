import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        boolean[] D = new boolean[10];
        for (int i = 0; i < K; i++) {
            D[sc.nextInt()] = true;
        }


        List<Integer> ans = new ArrayList<>();
        while(N > 0){
            int r = N % 10;
            boolean nextDigit = false; //ひと桁繰り上がるか

            int i = r;
            while(i != r - 1){
                if(D[i] != true){
                    ans.add(i);
                    break;
                }

                if(i == 9){
                    i = 0;
                    nextDigit = true;
                } else {
                    i++;
                }
            }

            N /= 10;

            if(nextDigit){
                N++;
            }
        }


        Collections.reverse(ans);
        for(int i : ans){
            out.print(i);
        }
        out.println();
    }
}