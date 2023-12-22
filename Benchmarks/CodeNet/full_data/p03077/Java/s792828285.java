import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int transport[] = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };
        int person[] = { N, 0, 0, 0, 0, 0 };
        int plusPerson[] = { 0, 0, 0, 0, 0 };
        boolean loopFlag = true;
        long counter = 0;

        while (loopFlag) {
            // 人数現象フェーズ
            for (int i = 0; i < person.length - 1; i++) {
                if (person[i] - transport[i] >= 0) {
                    plusPerson[i] = transport[i];
                    person[i] = person[i] - transport[i];
                } else {
                    plusPerson[i] = person[i];
                    person[i] = 0;
                }
            }
            // 人数増加フェーズ
            for (int i = 0; i < person.length - 1; i++) {
                person[i + 1] = person[i + 1] + plusPerson[i];
            }

            counter++;
            if (person[5] == N) {
                loopFlag = false;
            }

            // 増加配列の初期化
            for (int i = 0; i < plusPerson.length; i++) {
                plusPerson[i] = 0;
            }
        }

        System.out.println(counter);
        sc.close();
    }
}