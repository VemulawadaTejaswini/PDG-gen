import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> c = new ArrayList<>();
        for (int i = 1; (int)(i * 0.08) > a; i++) {
            if ((int)(i * 0.08) == a) {
                c.add(i);
            }
        }

        List<Integer> d = new ArrayList<>();
        for (int i = 1; (int)(i * 0.1) > b; i++) {
            if ((int)(i * 0.1) == b) {
                d.add(i);
            }
        }

        int answer = -1;
        for (int i = 0; i < c.size(); i++) {
            for (int j = 0; j < d.size(); j++) {
                if (c.get(i) == d.get(j)) {
                    answer = c.get(i);
                    break;
                }
            }
            if (answer != -1) {
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
