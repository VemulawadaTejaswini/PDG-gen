import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();

        long min = Integer.MAX_VALUE;

        Set<Long> ab = new HashSet<>();
        for (long i = a; i <= b; i++) {
                ab.add(i % 2019);
        }

        ArrayList<Long> list = new ArrayList(ab);
        Collections.sort(list);


        System.out.println((list.get(0)%2019*list.get(1)%2019)%2019);
    }
}