import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            count++;
            list.add((int) n % 10);
            n /= 10;
        }
        boolean allNine = true;
        for (int x : list) {
            if (x != 9) allNine = false;
        }

        if (allNine) {
            System.out.println(list.size() * 9);
        } else {
            System.out.println(list.get(list.size() - 1) - 1 + (list.size() - 1) * 9);
        }
    }

}