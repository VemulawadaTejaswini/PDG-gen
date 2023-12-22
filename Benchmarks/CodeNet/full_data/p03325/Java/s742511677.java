import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Long> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            long n = sc.nextLong();
            if (n % 2 == 0) {
                list.add(n);
            }
        }


        int c = 0;
        while (list.size() > 0) {
            int maxIndex = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(maxIndex) < list.get(i)) {
                    maxIndex = i;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (i == maxIndex) {
                    list.set(i, list.get(i) / 2);
                } else {
                    list.set(i, list.get(i) * 3);
                }
            }

            int lenght = list.size();
            for (int i = 0; i < lenght; i++) {
                if (list.get(i) % 2 != 0) {
                    list.remove(i);
                    lenght = list.size();
                }
            }
            c++;
        }
        System.out.println(c);
    }
}
