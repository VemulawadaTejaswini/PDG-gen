import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for (int i = 100; i >= 2; i--) {
            int tmp = i * i;
            while (tmp <= n) {
                list.add(tmp);
                tmp *= i;
            }
        }
        list.sort(Comparator.reverseOrder());
        System.out.println(list.get(0));
    }
}
