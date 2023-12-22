import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        int h = sc.nextInt(), w = sc.nextInt();
        for (int i = 0; i < w; i++) {
            list.add(sc.nextLong());
            h -=list.get(i);
        }
        System.out.println (h < 0 ? -1 : h);
    }
}
