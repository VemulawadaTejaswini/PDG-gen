import java.text.SimpleDateFormat;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new TreeMap<>();

        String temp = sc.nextLine();

        String[] tempArr = temp.split(" ");

        int N = Integer.parseInt(tempArr[0]);
        int M = Integer.parseInt(tempArr[1]);

        for (int i = 0; i < N; i++) {
            temp = sc.nextLine();
            tempArr = temp.split(" ");
            map.put(Integer.parseInt(tempArr[0]),Integer.parseInt(tempArr[1]));
        }

        long tp = 0L;
        for (Map.Entry<Integer,Integer> set : map.entrySet()) {
            if (set.getValue() <= M) {
                tp += (long) set.getValue() * set.getKey();
                M -= set.getValue();
            } else {
                while (M > 0) {
                    M--;
                    tp += (long) set.getKey();
                }
            }
        }

        System.out.println(tp);






    }

}
