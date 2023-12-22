import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * TITLE : Banned K
 * URL : https://atcoder.jp/contests/abc159/tasks/abc159_d
 */
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        HashMap<Integer, Numbers> map = new HashMap<Integer, Numbers>();
        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            list.add(number);
            if (!map.containsKey(number)) {
                map.put(number, new Numbers());
            }
            else {
                map.get(number).value++;
            }
        }
        sc.close();

        int tmp = 0;
        for (Integer key : map.keySet()) {
            int comb = 0;
            int value = map.get(key).value;
            for (int j = 1; j < value; j++) {
                for (int k = j; k < value; k++) {
                    comb++;
                }
            }
            map.get(key).comb = comb;
            tmp += comb;
        }

        for (int i = 0; i < list.size(); i++) {
            int sub = list.get(i);
            int answer = tmp;
            Numbers n = map.get(sub);
            answer -= n.comb;

            for (int j = 1; j < n.value - 1; j++) {
                for (int k = j; k < n.value - 1; k++) {
                    answer++;
                }
            }
            System.out.println(answer);

        }
    }

    private static class Numbers {
        int value = 1;

        int comb;
    }
}