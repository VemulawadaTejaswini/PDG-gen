import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        if (n == 1) {
            System.out.println(0);
        } else if (n >= 2) {
            int[] len = new int[n - 1];
            for (int i = 0; i < h.length; i++) {
                h[i] = sc.nextInt();
            }
            for (int i = 0; i < len.length; i++) {
                if (h[i] >= h[i + 1]) {
                    len[i] = 1;
                } else {
                    len[i] = 0;
                }
            }
            List<Integer> memory = new ArrayList<>();
            int counter = 0;
            for (int i = 0; i < len.length; i++) {
                if (len[i] == 1) {
                    counter++;
                }
                if (len[i] == 0 || i == len.length - 1) {
                    memory.add(counter);
                    counter = 0;
                }
            }
            int max = memory.get(0);
            for (int i : memory) {
                if (i > max) {
                    max = i;
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}