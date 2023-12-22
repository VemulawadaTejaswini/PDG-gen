import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            if(list.contains(a)) {
                list.remove(a);
            } else {
                list.add(a);
            }
        }
        System.out.println(list.size());
    }
}