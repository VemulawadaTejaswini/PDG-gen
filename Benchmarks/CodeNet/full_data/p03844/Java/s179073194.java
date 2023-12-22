import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qNumber = sc.nextInt();
        ArrayList<Integer> answerTimes = new ArrayList<>();
        for (int i = 0; i < qNumber; i++) {
            answerTimes.add(sc.nextInt());
        }
        int sum = 0;
        for (Integer time : answerTimes) {
            sum += time;
        }
        int drinkTypes = sc.nextInt();
        for (int i = 0; i < drinkTypes; i++) {
            int answer = sum - answerTimes.get(sc.nextInt()-1) + sc.nextInt();
            System.out.println(answer);
        }


    }
}
