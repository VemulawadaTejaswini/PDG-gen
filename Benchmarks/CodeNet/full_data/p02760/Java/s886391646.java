import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        final Main m = new Main();
        m.run();
    }

    private void run() {
        int[][] card = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                card[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (nums.contains(card[i][j])) {
                    card[i][j] = -1;
                }
            }
        }

        if (
            (card[0][0] == -1 && card[0][1] == -1 && card[0][2] == -1) ||
            (card[1][0] == -1 && card[1][1] == -1 && card[1][2] == -1) ||
            (card[2][0] == -1 && card[2][1] == -1 && card[2][2] == -1) ||
            (card[0][0] == -1 && card[1][0] == -1 && card[2][0] == -1) ||
            (card[0][1] == -1 && card[1][1] == -1 && card[2][1] == -1) ||
            (card[0][2] == -1 && card[1][2] == -1 && card[2][2] == -1) ||
            (card[0][0] == -1 && card[1][1] == -1 && card[2][2] == -1) ||
            (card[0][2] == -1 && card[1][1] == -1 && card[2][0] == -1)
        ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
