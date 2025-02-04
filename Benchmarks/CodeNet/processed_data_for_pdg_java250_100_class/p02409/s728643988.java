public class Main {
    public static void main(String[] args) {
        int[][][] info = new int[4][3][10];
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 3; j ++) {
                for (int k = 0; k < 10; k ++) { info[i][j][k] = 0; }
            }
        }
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        int built = 0;
        int floor = 0;
        int room = 0;
        int num = 0;
        for (int i = 0; i < n; i ++) {
            built = sc.nextInt();
            floor = sc.nextInt();
            room = sc.nextInt();
            num = sc.nextInt();
            info[built - 1][floor - 1][room - 1] += num;
        }
        for (int i = 0; i < 4; i ++) {
            for (int j = 0; j < 3; j ++) {
                for (int k = 0; k < 10; k ++) {
                    System.out.print(" " + info[i][j][k]);
                }
                System.out.print("\n");
            }
            if (i != 4 - 1) { System.out.print("####################\n"); }
        }
    }
}
