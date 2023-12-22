import java.util.*;

/**
 * Main
 */
public class Main {

    public int n;
    public int size;

    public static void main(String[] args) {
        (new Main()).go();
    }

    public void go() {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        size = 2 * n;

        int[] idx = new int[size];
        int[] node = new int[size];

        for (int i = 0; i < size; i++) {
            node[i] = i;
            idx[i] = i;
        }

        // そのまま
        boolean _finishFlg = true;
        for (int i = 0; i < n; i++) {
            int result = 0;
            int start = (idx[i] < idx[n + i] ? idx[i] : idx[n + i]);
            int goal = (idx[i] < idx[n + i] ? idx[n + i] : idx[i]);
            for (int j = start; j <= goal; j++) {
                result ^= ((node[j] % n) + 1);
            }
            if (result != (i + 1)) {
                _finishFlg = false;
                break;
            }
        }
        if (_finishFlg) {
            for (int i = 0; i < size - 1; i++) {
                System.out.println((node[i] + 1) + " " + (node[i + 1] + 1));
            }
            return;
        }

        for (int _i = 0; _i < size; _i++) {
            for (int _j = _i + 1; _j < size; _j++) {

                int tmp = node[_i];
                node[_i] = node[_j];
                node[_j] = tmp;
                int tmpIdx = idx[node[_i]];
                idx[node[_i]] = idx[node[_j]];
                idx[node[_j]] = tmpIdx;

                boolean finishFlg = true;
                for (int i = 0; i < n; i++) {
                    int result = 0;
                    int start = (idx[i] < idx[n + i] ? idx[i] : idx[n + i]);
                    int goal = (idx[i] < idx[n + i] ? idx[n + i] : idx[i]);
                    for (int j = start; j <= goal; j++) {
                        result ^= ((node[j] % n) + 1);
                    }
                    if (result != (i + 1)) {
                        finishFlg = false;

                        tmp = node[_i];
                        node[_i] = node[_j];
                        node[_j] = tmp;

                        tmpIdx = idx[node[_i]];
                        idx[node[_i]] = idx[node[_j]];
                        idx[node[_j]] = tmpIdx;

                        break;
                    }
                }
                if (finishFlg) {
                    for (int i = 0; i < size - 1; i++) {
                        System.out.println((node[i] + 1) + " " + (node[i + 1] + 1));
                    }
                    return;
                }

            }
        }

        System.out.println("No");
    }
}