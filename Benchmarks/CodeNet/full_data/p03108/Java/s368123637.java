import java.util.*;

class Bridge {
    int start, end;

    public Bridge(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Set<Integer> toSet() {
        Set<Integer> s = new HashSet<>();
        s.add(this.start);
        s.add(this.end);
        return s;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayDeque<Bridge> stack = new ArrayDeque<>();
        ArrayDeque<Integer> result = new ArrayDeque<>();

        int initNum = n * (n - 1) / 2;
        result.push(initNum);

        for (int i = 0; i < m; i++) {
            stack.push(new Bridge(sc.nextInt(), sc.nextInt()));
        }

        LinkedList<Set<Integer>> islands = new LinkedList<>();
        Set<Integer> islandNums = new HashSet<>();

        while (stack.size() != 1) {
            Bridge b = stack.pop();
            int tmpSum = 0;
            Set<Integer> tmp = new HashSet<>();
            if (!islandNums.contains(b.start) && !islandNums.contains(b.end)) {
                islandNums.addAll(b.toSet());
                islands.add(b.toSet());
            } else {
                Set<Set<Integer>> removeList = new HashSet<>();
                for (Set<Integer> s : islands) {
                    if (s.contains(b.start) || s.contains(b.end)) {
                        tmp.addAll(s);
                        removeList.add(s);
                    }
                }
                islands.removeAll(removeList);
                tmp.addAll(b.toSet());
                islands.add(tmp);
            }

            for (Set<Integer> s : islands) {
                int ss = s.size();
                tmpSum += ss * (ss - 1) / 2;
            }
            result.push(Math.max(initNum - tmpSum, 0));
        }

        for (int i : result) {
            System.out.println(i);
        }
    }
}
