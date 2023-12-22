import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        Map<Character, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            char tmp = sc.next().charAt(0);
            if (tmp == 'M') {
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp)+1);
                } else {
                    map.put(tmp, 1);
                }
            } else if (tmp == 'A') {
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp)+1);
                } else {
                    map.put(tmp, 1);
                }
            } else if (tmp == 'R') {
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp)+1);
                } else {
                    map.put(tmp, 1);
                }
            } else if (tmp == 'C') {
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp)+1);
                } else {
                    map.put(tmp, 1);
                }
            } else if (tmp == 'H') {
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp)+1);
                } else {
                    map.put(tmp, 1);
                }
            }

        }

//        System.out.println(map);

        List<Integer> list = new ArrayList<>();
        for (int t: map.values()) list.add(t);

//        System.out.println(list);


        long res = 0;

        for (int i=0; i<list.size()-2; i++) {
            for (int j=i+1; j<list.size()-1; j++) {
                for (int k=j+1; k<list.size(); k++) {
                    res += list.get(i) * list.get(j) * list.get(k);
                }
            }
        }

        System.out.println(res);

    }
}

