import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] card = new int[a[0] + 1];
        card[0] = a[2];
        for (int i = 1; i < a[0] + 1; i++) {
            card[i] = sc.nextInt();
        }
        int last = card[card.length - 1];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < card.length - 1; ) {
            for (int j = card.length - 2; j >= i; j--) { // x
                if (Math.abs(last - card[j]) > max) {
                    max = Math.abs(last - card[j]);
                    i = j + 1;
                }
            }
            for (int j = card.length - 2; j >= i; j--) { // y
                if (Math.abs(last - card[j]) < min) {
                    min = Math.abs(last - card[j]);
                    i = j + 1;
                }
            }
        }
        System.out.println(max);
    }
}
