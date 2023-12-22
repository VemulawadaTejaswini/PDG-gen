import java.util.*;

class Main {
    public static void main(final String[] args) {
        int  n[] = new int[3];
        try  (Scanner scanner = new Scanner(System.in);) {
            for(int i = 0; i < 3; i++) {
                n[i] = scanner.nextInt();
            }
            System.out.println(calculation(n));
        }
    }

    private static int calculation(final int[] n) {
        int train = n[0] * n[1];
        int taxi = n[2];
        if (train < taxi) {
            return train;
        }
        return taxi;
    }
}
