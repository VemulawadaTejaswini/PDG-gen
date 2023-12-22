import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> A = new ArrayList<>();
        for (int i = 0; i < H; i++) {
            List<Integer> Ai = new ArrayList<>();
            for (int j = 0;j < W; j++) {
                int val = sc.nextInt();
                Ai.add(val);
                List<Integer> l = new ArrayList<>();
                l.add(i);
                l.add(j);
                map.put(val, l);
            }
            A.add(Ai);
        }

        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++){
            int L = sc.nextInt();
            int R = sc.nextInt();
            int score = 0;
            while(L != R) {
                score += abs(map.get(L).get(0) - map.get(L+D).get(0)) + abs(map.get(L).get(1) - map.get(L+D).get(1));
                L+=D;
            }
            System.out.println(score);
        }


    }
    private static int abs(int val){
        if (val >= 0){
            return val;
        } else {
            return -val;
        }
    }
}
