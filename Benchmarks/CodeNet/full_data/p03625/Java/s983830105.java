import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0 ; i < n ; i++) {
            list.add(sc.nextInt());
        }
        list.sort(Comparator.reverseOrder());

        int longSide = 0;
        int shortSide = 0;
        //降順にならべてあるリストから長辺と短辺をとっていく。長辺と短辺の長さが同じになることもある。
        for (int i = 0 ; i < n - 1 ; i++) {
            if (list.get(i) == list.get(i + 1) && longSide == 0) {
                longSide = list.get(i);
                i++;
            } else if (list.get(i) == list.get(i + 1)) {
                shortSide = list.get(i);
                break;
            }
        }
        System.out.println((long) longSide * (long) shortSide);

    }

}