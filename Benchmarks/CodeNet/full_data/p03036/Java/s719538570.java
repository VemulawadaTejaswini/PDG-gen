import java.util.*;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        long x2000 = scanner.nextLong();
        scanner.close();

        // check
        Map<Integer, Long> map = new HashMap<>();
        map.put(2000, x2000);

        for (int i = 2001; i <= 2010; i++) {
            long x = r * map.get(i - 1) - D;
            map.put(i, x);
            System.out.println(x);
        }


//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
