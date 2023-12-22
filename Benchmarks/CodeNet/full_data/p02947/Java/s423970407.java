import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<String> strList = Arrays.stream(sc.next().split("")).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
            list.add(String.join("", strList));
        }
        long cnt = 0;
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (str.equals(list.get(j))) cnt++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}