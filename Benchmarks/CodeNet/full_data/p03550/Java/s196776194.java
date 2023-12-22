import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt()};
        long[] card = new long[a[0] + 2];
        card[0] = sc.nextLong();
        card[1] = sc.nextLong();
        for (int i = 2; i < a[0] + 2; i++) {
            card[i] = sc.nextInt();
        }
        long last = card[card.length - 1];
        long max = 0;
        for (int i = card.length - 2; i >= 0; i--) {
            if (Math.abs(last - card[i]) > max) {
                max = Math.abs(last - card[i]);
            }
        }
        System.out.println(max);
    }
}
