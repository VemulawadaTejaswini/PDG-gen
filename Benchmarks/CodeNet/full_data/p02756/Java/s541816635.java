import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        List<String> strList = IntStream.range(0, s.length).mapToObj(i -> String.valueOf(s[i])).collect(Collectors.toList());
        sc.nextLine();
        int q = sc.nextInt();
        boolean reverse = false;
        List<String> addBeggining = new ArrayList<>();
        List<String> addEnd = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            sc.nextLine();
            int t = sc.nextInt();
            if (t == 1) {
                reverse = !reverse;
            } else {
                int f = sc.nextInt();
                if (f == 1) {
                    if (!reverse) {
                        addBeggining.add(sc.next());
                    } else {
                        addEnd.add(sc.next());
                    }
                } else {
                    if (!reverse) {
                        addEnd.add(sc.next());
                    } else {
                        addBeggining.add(sc.next());
                    }
                }
            }
        }
        if (!reverse) {
            Collections.reverse(addBeggining);
            strList.addAll(0, addBeggining);
            strList.addAll(addEnd);
        } else {
            Collections.reverse(addEnd);
            Collections.reverse(strList);
            strList.addAll(0, addEnd);
            strList.addAll(addBeggining);
        }
        System.out.println(String.join("", strList));
    }
}
