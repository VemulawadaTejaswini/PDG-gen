import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Map<Integer, Integer> tmpMap = new HashMap<>();
        for (int i = 1; i <= count; i++) {
            tmpMap.put(sc.nextInt(), i);
        }
        sc.close();
        String order[] = new String[count];
        for (int i = 1; i <= count; i++) {
            order[i - 1] = tmpMap.get(i).toString();
        }

        System.out.println(String.join(" ", order));
    }
}