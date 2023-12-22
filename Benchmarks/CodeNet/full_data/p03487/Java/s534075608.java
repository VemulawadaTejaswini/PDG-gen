import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int N;
    static HashMap<Integer, Integer> a;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        a = new HashMap<>();
        for(int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            if(a.containsKey(number)) {
                Integer c = a.get(number);
                c++;
                a.put(number, c);
            } else {
                a.put(number, 1);
            }
        }

        scanner.close();
    }


    public static void main(String args[]) {
        init();

        int count = 0;
        for(Integer i : a.keySet()) {
            if(a.get(i) < i) {
                count += a.get(i);
            } else if (a.get(i) > i) {
                count += Math.abs(i - a.get(i));
            }
        }
        System.out.println(count);
    }
}
