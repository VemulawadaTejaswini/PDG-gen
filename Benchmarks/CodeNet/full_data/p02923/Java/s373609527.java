import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] squares = new int[N];

        for (int i = 0; i < squares.length; i++) {
            squares[i] = in.nextInt();
        }

        int min = 0, count = 0;
        for (int i = squares.length-1; i > 0; i--) {
            if (squares[i] <= squares[i-1]) {
                count++;
            }
            else {
                min = Math.max(count, min);
                count = 0;
            }
        }

        System.out.println(min);
    }
}