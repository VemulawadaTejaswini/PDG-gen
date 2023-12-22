import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> in;
        in = new ArrayList<>();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            if (in.contains(number)) {
                in.remove(Integer.valueOf(number));
            } else {
                in.add(number);
            }
        }
        System.out.println(in.size());
    }
}