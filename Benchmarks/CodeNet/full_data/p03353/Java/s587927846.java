import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < str.length() + 1 ; i++) {
            for (int j = i + 1; j < str.length() + 1; j++) {
                set.add(str.substring(i, j));
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println(list.get(k - 1));

    }

}