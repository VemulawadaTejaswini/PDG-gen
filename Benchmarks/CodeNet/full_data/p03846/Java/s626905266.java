
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleNumber = sc.nextInt();
        ArrayList<Integer> trueNumbers = new ArrayList<>();
        if (peopleNumber % 2 == 0) {
            for (int i = 1; i <= peopleNumber / 2; i++) {
                trueNumbers.add(2 * i - 1);
                trueNumbers.add(2 * i - 1);
            }
        } else {
            trueNumbers.add(0);
            for (int i = 1; i <= (peopleNumber - 1) / 2; i++) {
                trueNumbers.add(2 * i);
                trueNumbers.add(2 * i);
            }
        }

        int targetNumber;
        for (int i = 0; i < peopleNumber; i++) {
            targetNumber = sc.nextInt();
            if (trueNumbers.contains(targetNumber)) {
                trueNumbers.remove(targetNumber);
            } else {
                System.out.println(0);
                return;
            }
        }
        
        if (peopleNumber % 2 == 0) {
            System.out.println(Math.pow(2, peopleNumber / 2) % (Math.pow(10, 9) + 7));
        } else {
            System.out.println(Math.pow(2, (peopleNumber - 1) / 2) % (Math.pow(10, 9) + 7));
        }

    }
}
