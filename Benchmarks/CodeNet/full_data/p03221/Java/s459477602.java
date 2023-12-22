import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, Integer> mapP = new HashMap<Integer, Integer>();
        Map<Integer, Integer> mapI = new HashMap<Integer, Integer>();
        int[] Y = new int[M];
        for(int i = 0; i < M; i++){
            int p = sc.nextInt();
            int y = sc.nextInt();
            mapP.put(y, p);
            mapI.put(y, i);
            Y[i] = y;
        }
        sc.close();

        Arrays.sort(Y);
        int[] P = new int[N];
        String[] S = new String[M];
        for(int y: Y){
            int p = mapP.get(y);
            int x = P[p-1] + 1;
            P[p-1] = x;
            StringBuffer sb = new StringBuffer();
            sb.append(String.format("%06d", p));
            sb.append(String.format("%06d", x));
            S[mapI.get(y)] =  sb.toString();
        }

        for(int j = 0; j < M; j++){
            System.out.println(S[j]);
        }
    }

}
