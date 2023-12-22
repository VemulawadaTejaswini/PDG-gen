import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        ArrayList<Integer> ms = new ArrayList();

        for (int i = 0; i < N; i++) {
            ms.add(scanner.nextInt());
        }

        Collections.sort(ms);

        int atLeastX = ms.stream().reduce(0, (i1, i2) -> i1 + i2);

        int count = 0;

        if (X - atLeastX >= 0) {
            count += ms.size();
            X -= atLeastX;
        }

        while (X - ms.get(0) >= 0) {
            count++;
            X -= ms.get(0);
        }

        System.out.print(count);
    }
}