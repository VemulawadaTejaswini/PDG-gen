import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] oddCount = new int[100001];
        int[] evenCount = new int[100001];

        int oddMostAppearedCount = 0;
        int oddMostAppearedValue = 0;

        int evenMostAppearedCount = 0;
        int evenMostAppearedValue = 0;

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            if (i % 2 == 0) {
                evenCount[value] = evenCount[value] + 1;
                if (evenCount[value] > evenMostAppearedCount) {
                    evenMostAppearedValue = value;
                    evenMostAppearedCount = evenCount[value];
                }
            } else {
                oddCount[value] = oddCount[value] + 1;
                if (oddCount[value] > oddMostAppearedCount) {
                    oddMostAppearedValue = value;
                    oddMostAppearedCount = oddCount[value];
                }
            }
        }
        Arrays.sort(evenCount);
        Arrays.sort(oddCount);

        if (oddMostAppearedValue != evenMostAppearedValue) {
            System.out.println(N - evenCount[100000] - oddCount[100000]);
        } else {
            // evenの方を２番めに多いもので書き換える場合
            int evenOverWrite = (N / 2) - evenCount[99999] + (N / 2) - oddCount[100000];
            // oddの方を２番めに多いもので書き換える場合
            int oddOverWrite = (N / 2) - oddCount[99999] + (N / 2) - evenCount[100000];

            System.out.println(Math.min(evenOverWrite, oddOverWrite));
        }
    }


}
