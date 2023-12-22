import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class InputData {
    public int R;
    public int L;
    public int D;
    public boolean done;
}

public class Main {
    public static void dump(HashMap<Integer, Integer> in) {
        for (Integer k : in.keySet()) {
            System.out.println(k + " => " + in.get(k));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<InputData> input = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            InputData tmp = new InputData();
            tmp.R = sc.nextInt();
            tmp.L = sc.nextInt();
            tmp.D = sc.nextInt();
            tmp.done = false;
            input.add(tmp);
        }

        HashMap<Integer, Integer> defined = new HashMap();

        boolean up_first = true;
        boolean first = true;
        while(true) {
            if (up_first) first = true;
            boolean add = false;
            boolean all_done = true;
            for (InputData d : input) {
                //dump(defined);
                if (d.done == true) continue;
                if (first && d.done == false) {
                    defined.put(d.R, 0);
                    defined.put(d.L, d.D);
                    d.done = true;
                    first = false;
                    continue;
                }
                if (defined.containsKey(d.R) && defined.containsKey(d.L)) {
                    // 矛盾
                    if (defined.get(d.L) - defined.get(d.R) != d.D) {
                        System.out.println("No");
                        return;
                    }
                }
                if (defined.containsKey(d.R)) {
                    defined.put(d.L, defined.get(d.R) + d.D);
                    d.done = true;
                    continue;
                }
                if (defined.containsKey(d.L)) {
                    defined.put(d.R, defined.get(d.L) - d.D);
                    d.done = true;
                    continue;
                }

                if (d.done == false) all_done = false;
            }
            // 何もaddできなかった場合は距離が分かっている集合が別に存在してしまっている
            if (!add) up_first = true;
            if (!all_done) continue;
            break;
        }
        System.out.println("Yes");
    }
}