import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int a;

        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(scan.next());
            list.add(a);
        }

        int sum = 0;
        for (int s : list) {
            sum += s;
        }

        int vote = sum / (4 * m);
        int count = 0;
        for (int s : list) {
            if (s >= vote) {
                count++;
            }
        }
        if (count >= m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}