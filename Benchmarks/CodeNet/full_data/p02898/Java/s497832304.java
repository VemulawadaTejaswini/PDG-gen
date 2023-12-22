import java.util.*;

public class Main {
    public static void main(String...args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> men = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            men.add(sc.nextInt());
        }
        long l =
        men.stream().filter(s -> s >= k).count();
        System.out.println(l);
    }

}
