import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfItems = sc.nextInt();
        int numOfPopItemsLowerLimit = sc.nextInt();
        int cnt = 0;
        int sumOfVotes = 0;

        int[] numOfVotes = new int[numOfItems];

        for (int i = 0; i < numOfItems; i++) {
            numOfVotes[i] = sc.nextInt();
            sumOfVotes += numOfVotes[i];
        }

        for (int i = 0; i < numOfItems; i++) {
            if ((double) numOfVotes[i] >= (double) sumOfVotes / 4 / numOfPopItemsLowerLimit) {
                cnt++;
            }
        }

        if (cnt >= numOfPopItemsLowerLimit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
