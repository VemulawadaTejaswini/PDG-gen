
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }
        int average = (int) Math.round(a.stream().mapToDouble(i -> i).average().orElse(0));
        int sum = (int) a.stream().mapToDouble(i -> Math.pow((double) average - i, 2)).sum();
        System.out.println(sum);
    }
}