import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int numOfEvensOverFour = 0;
        int numOfOdds = 0;

        for (int i = 0; i < N; i++) {
            long value = sc.nextLong();
            if (value % 2 == 0 && value >= 4) {
                numOfEvensOverFour++;
            }
            if (value % 2 == 1) {
                numOfOdds++;
            }
        }

        System.out.println(numOfEvensOverFour >= (numOfOdds  - 1) ? "Yes" : "No");
    }
}