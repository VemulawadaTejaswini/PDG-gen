import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int k = stdIn.nextInt();

        long[] topHp = new long[k];
        long totalHp = 0;
        for (int i = 0; i < n; i++) {
            int temp = stdIn.nextInt();
            totalHp += checkTopHP(temp, topHp);
        }

        System.out.println(totalHp);

    }

    static long checkTopHP(long value, long[] currentTop) {
        for (int i = 0; i < currentTop.length; i++) {
            if (value > currentTop[i]) {
                for (int j = i; j < currentTop.length; j++) {
                    long temp = currentTop[j];
                    currentTop[j] = value;
                    value = temp;
                }
                return value;
            }
        }
        return value;
    }
}
