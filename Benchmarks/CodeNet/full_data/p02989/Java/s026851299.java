import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        list.sort(Integer::compareTo);

        int hoge = list.size() / 2;
        int left = list.get(hoge - 1);
        int right = list.get(hoge);
        System.out.println(right - left);
    }
}