import java.util.*;

public class Main {
    static int n, m;
    static int[] l, r, d;
    static String s;
    static int modP = 1000000007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        l = new int[m];
        r = new int[m];
        d = new int[m];

        Map<Integer, List<E>> map = new HashMap<>();

        for(int i = 0; i < m; i++) {
            l[i] = in.nextInt();
            r[i] = in.nextInt();
            d[i] = in.nextInt();
            E e = new E(l[i], r[i], d[i]);
            List<E> leftList = map.containsKey(l[i]) ? map.get(l[i]) : new LinkedList<E>();
            leftList.add(e);
            map.put(l[i], leftList);

            List<E> rightList = map.containsKey(r[i]) ? map.get(r[i]) : new LinkedList<E>();
            rightList.add(e);
            map.put(r[i], rightList);
        }

        int[] line = new int[n+1];
        boolean[] visited = new boolean[n+1];

        List<E> init = new LinkedList<E>();
        E e = new E(0, 1, 0);
        init.add(e);
        map.put(0, init);
        visited[0] = true;

        for(int i = 0; i < n + 1; i++) {
            if(!visited[i]) {
                if(!checkAndPadding(i, line[i], visited, line, map)) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }

    static boolean checkAndPadding(int id, int position, boolean[] visited, int[] line, Map<Integer, List<E>> map) {
        if(visited[id]) return line[id] == position;

        line[id] = position;
        visited[id] = true;

        if(!map.containsKey(id)) return true;

        List<E> list = map.get(id);
        for(E e : list) {
            int targetId, targetPos;
            if(e.l == id) {
                targetId = e.r;
                targetPos = line[id] + e.d;
            }else{
                targetId = e.l;
                targetPos = line[id] - e.d;
            }

            if(visited[targetId]) {
                if (line[targetId] != targetPos){
                    return false;
                }
            }else{
                if(!checkAndPadding(targetId, targetPos, visited, line, map)) {
                    return false;
                }
            }
        }

        return true;
    }
}

class P {
    int x, y;
    P(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class E {
    int l, r, d;
    E(int l, int r, int d) {
        this.l = l;
        this.r = r;
        this.d = d;
    }
}