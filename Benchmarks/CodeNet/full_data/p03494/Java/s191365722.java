import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int[] inputs = new int[a];
        int cnt = 0;
        boolean existsOdd = false;
        for (int i = 0; i < a; i++) {
            inputs[i] = Integer.parseInt(sc.next());
        }
        while (true) {
            if (!existsOdd) {
                for (int i = 0; i < a; i++) {
                    inputs[i] = inputs[i] / 2;
                }
                cnt++;
                for (int i = 0; i < a; i++) {
                    if (inputs[i] % 2 != 0) {
                        existsOdd = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        System.out.println(cnt);
    }
}
