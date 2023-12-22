import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String s = stdin.next();
        int x = stdin.nextInt();
        int y = stdin.nextInt();

        int[] t = Arrays.stream(s.split("T")).mapToInt(String::length).toArray();
        int[] vx = IntStream.range(0, t.length).filter(i -> i % 2 == 0).map(i -> t[i]).toArray();
        int[] vy = IntStream.range(0, t.length).filter(i -> i % 2 != 0).map(i -> t[i]).toArray();

        Set<Integer> sx = new HashSet<>();
        if (vx.length == 0) {
             sx.add(0);
        } else {
             sx.add(vx[0]);
        }
        for (int i = 1; i < vx.length; i++) {
            int d = vx[i];
            sx = sx.stream().flatMap(j -> Stream.of(j, j + d, j - d)).collect(Collectors.toSet());
        }

        Set<Integer> sy = new HashSet<>();
        sy.add(0);
        for (int d : vx) {
            sy = sy.stream().flatMap(j -> Stream.of(j, j + d, j - d)).collect(Collectors.toSet());
        }


        if (sx.contains(x) && sy.contains(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
