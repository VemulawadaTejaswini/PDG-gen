import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        int[] num = new int[N];
        for (int i = 0; i < num.length; i++) {
            num[i] = -1;
        }
        for (int i = 0; i < M; i++) {
            int keta = sc.nextInt() - 1;
            int value = sc.nextInt();
            if (num[keta] != -1 && num[keta] != value) {
                System.out.println(-1);
                return;
            } else if (keta == 0 && value == 0) {
                System.out.println(-1);
                return;
            }
            num[keta] = value;
        }
        sc.close();

        for (int i = 0; i < num.length; i++) {
            if (num[i] == -1)
                num[i] = 0;
            System.out.print(num[i]);
        }

        System.out.println();
    }
}
