import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        boolean flg = true;
        outside:
        {
            for (int i = 0; i <= X / 100; i++) {
                for (int j = 0; j <= X / 101; j++) {
                    for (int k = 0; k <= X / 102; k++) {
                        for (int l = 0; l <= X / 103; l++) {
                            for (int m = 0; m <= X / 104; m++) {
                                if ((X - (100 * i + 101 * j + 102 * k + 103 * l + 104 * m)) % 105 == 0) {
                                    System.out.println("1");
                                    flg = false;
                                    break outside;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (flg) {
            System.out.println("0");
        }
    }
}