import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        String[] array = S.split("");

        int continuous = 1;
        List<Integer> renzokuBox = new ArrayList<>();

        for (int i = 1; i < array.length; i++) {

            if (array[i].equals(array[i - 1])) {

                continuous++;

            } else {

                renzokuBox.add(continuous);
                continuous = 0;

            }
        }
        int saidai = Collections.max(renzokuBox);

        if ((saidai + K) > array.length) {

            saidai = array.length;
        } else {

            saidai = saidai + K;
        }

        System.out.println(saidai);
        
        //        sc.close();
    }

}