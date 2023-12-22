import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        int n = sc.nextInt();

        List<Integer> ryokan = new ArrayList<>();

        int c = 0;
        for (int i=0; i < n; i++) {
            ryokan.add(sc.nextInt());
            if (check(i, ryokan))
                c++;
        }

        System.out.println(c);

    }

    private static boolean check(int i, List<Integer> ryokan) {
        for (int j=0; j < i; j++) {
            if (ryokan.get(j) > ryokan.get(i))
                return false;
        }
        return true;
    }

}
