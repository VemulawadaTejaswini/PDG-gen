
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, List<Integer>> tree = new HashMap<>();;

    public static void main(String[] args) {
        // とりあえず木を表現してみる
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean[] isRoot = new boolean[N + 1];
        Arrays.fill(isRoot, true);
        isRoot[0] = false;

        for (int i = 0; i < N - 1; i++) {
            Integer a = Integer.valueOf(sc.nextInt());
            Integer b = Integer.valueOf(sc.nextInt());
            isRoot[b] = false;

            if (!tree.containsKey(a)) {
                tree.put(a, new ArrayList<>());
            }
            tree.get(a).add(b);
        }

        Integer root = getRoot(isRoot);

        boolean[] depthIsOdd = new boolean[N + 1];
        depthIsOdd[root] = false;
        updateOddArray(depthIsOdd, true, root);

        Map<Integer, Deque<Integer>> sanDeWaru = new HashMap<>();
        sanDeWaru.put(0, new LinkedList<>());
        sanDeWaru.put(1, new LinkedList<>());
        sanDeWaru.put(2, new LinkedList<>());
        
        for (int i = 1; i <= N; i++) {
            sanDeWaru.get(i % 3).add(Integer.valueOf(i));
        }

        int trueCount = 0;
        int falseCount = 0;
        for (int i = 1; i < N + 1; i++) {
            if (depthIsOdd[i]) {
                trueCount++;
            } else {
                falseCount++;
            }
        }

        if (trueCount <= N / 3) {
            for (int i = 1; i < N; i++) {
                if(depthIsOdd[i]) {
                    System.out.print(sanDeWaru.get(0) + " ");
                }else {
                    if(!sanDeWaru.get(1).isEmpty()) {
                        System.out.print(sanDeWaru.get(1) + " ");
                    }else if (!sanDeWaru.get(1).isEmpty()) {
                        System.out.print(sanDeWaru.get(2) + " ");
                    }else {
                        System.out.print(sanDeWaru.get(0) + " ");
                    }
                }
            }


        }else if (falseCount <= N / 3) {
            for (int i = 1; i < N; i++) {
                if(!depthIsOdd[i]) {
                    System.out.print(sanDeWaru.get(0).poll() + " ");
                }else {
                    if(!sanDeWaru.get(1).isEmpty()) {
                        System.out.print(sanDeWaru.get(1).poll() + " ");
                    }else if (!sanDeWaru.get(1).isEmpty()) {
                        System.out.print(sanDeWaru.get(2).poll() + " ");
                    }else {
                        System.out.print(sanDeWaru.get(0).poll() + " ");
                    }
                }
            }
        }else {
            for (int i = 1; i < N; i++) {
                if(depthIsOdd[i]) {
                    if(!sanDeWaru.get(1).isEmpty()) {
                        System.out.print(sanDeWaru.get(1).poll() + " ");
                    }else {
                        System.out.print(sanDeWaru.get(0).poll() + " ");
                    }
                }else {
                    if(!sanDeWaru.get(2).isEmpty()) {
                        System.out.print(sanDeWaru.get(2).poll() + " ");
                    }else {
                        System.out.print(sanDeWaru.get(0).poll() + " ");
                    }
                }
            }
        }

        if(!sanDeWaru.get(1).isEmpty()) {
            System.out.print(sanDeWaru.get(1).poll());
        }else if (!sanDeWaru.get(1).isEmpty()) {
            System.out.print(sanDeWaru.get(2).poll());
        }else {
            System.out.print(sanDeWaru.get(0).poll());
        }
        System.out.println();
    }

    private static Integer getRoot(boolean[] b) {
        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                return i;
            }
        }
        return -1;
    }

    private static void updateOddArray(boolean[] depthIsOdd, boolean bool, Integer root) {
        if (tree.containsKey(root)) {
            tree.get(root).forEach(x -> {
                depthIsOdd[x] = bool;
                updateOddArray(depthIsOdd, !bool, x);
            });
        }
    }
}
