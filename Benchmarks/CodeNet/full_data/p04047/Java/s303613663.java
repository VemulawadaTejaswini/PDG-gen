import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n*2; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += list.get(i*2);
        }
        
        System.out.println(sum);
    }
}
