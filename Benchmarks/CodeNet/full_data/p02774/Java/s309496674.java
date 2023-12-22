import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int k = Integer.parseInt(scan.next());
        scan.nextLine();
        List<Integer> aList = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).sorted((x, y) -> y - x).collect(Collectors.toList());

        List<Long> list = new ArrayList<>();
        for (int i = 0; i < aList.size(); i++) {
            for (int l = 1; l < aList.size(); l++) {
                list.add((long) aList.get(i) + aList.get(l));
            }
        }

        list = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list.get(k-1));
    }
}
