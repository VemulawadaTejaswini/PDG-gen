import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long L = scanner.nextLong();
        long R = scanner.nextLong();

        long N = 2019 *3;

        N = Math.min(L + N, R);

        ArrayList<Long> mods = new ArrayList<>();

        for(long i=L; i<=R; i++){
            mods.add(i % 2019L);
        }

        Collections.sort(mods);

        System.out.println(mods.get(0) * mods.get(1) % 2019);

    }
}
