import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;
        List<String> list = new ArrayList<>();
        while (list.size() < N) {
            for (int i = 0; i < A;i++) {
                list.add("b");
            }
            for (int i = 0; i< B;i++) {
                list.add("r");
            }
        }
        for (String s:list.subList(0, N-1)) {
            if (s.equals("b")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
