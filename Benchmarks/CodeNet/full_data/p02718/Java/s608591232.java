import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(list);
        Collections.reverse(list);
        int allVote = 0;
        for (Integer i : list) {
            allVote += i;
        }

        String answer = "Yes";
        for (int i = 0; i < m; i++) {
            int vote = list.get(i);
            if (vote < (allVote / (4 * m))) {
                answer = "No";
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }

}
