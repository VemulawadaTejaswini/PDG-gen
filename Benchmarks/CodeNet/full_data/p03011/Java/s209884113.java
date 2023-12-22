import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int sum = P + Q + R;
        List<Integer> li = new ArrayList<Integer>();
        li.add(sum-P);
        li.add(sum-Q);
        li.add(sum-R);
        Collections.sort(li);
        System.out.println(li.get(0));
    }
}