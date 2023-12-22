import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] ac = new int[N];
        int[] pena = new int[N];

        for(int i=0; i<M; i++){
            int p = sc.nextInt();
            String S = sc.next();
            p--;
            if(ac[p] == 1) continue;
            if(S.equals("AC")){
               ac[p] = 1;
            } else {
                pena[p]++;
            }
        }

        int AC=0, PENA = 0;
        for (int i = 0; i < N; i++) {
            AC += ac[i];
            if(ac[i] == 1) PENA += pena[i];
        }
        System.out.println(AC + " " + PENA);

    }
}
