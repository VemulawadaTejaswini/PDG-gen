import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int cap_1 = H % 2 == 1 && W % 2 == 1 ? 1 : 0;
        int cap_2 = H % 2 + W % 2;
        int[] appearance = new int[26];
        for (int i = 0; i < H; i++) {
            String a = sc.next();
            for (int j = 0; j < W; j++) {
                appearance[a.charAt(j) - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (appearance[i] % 2 == 1) {
                cap_1--;
            } else if (appearance[i] % 4 == 2) {
                cap_2--;
            }
            if (cap_1 < 0 || cap_2 < 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
