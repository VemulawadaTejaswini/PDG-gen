import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer M = Integer.parseInt(scanner.next());
        Map<Integer, Integer> shop = new TreeMap<>();
        int[] choice = new int[M+1];
        Arrays.fill(choice, 0);


        for (int i = 0; i < N; i++) {
            shop.put(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
        }

        Long count = 0l;
        Long total = 0l;
        for (Integer str : shop.keySet()) {
            for (int i = 0; i < shop.get(str); i++) {
                if(count >= M) break;
                total += str;
                count++;
            }
        }
        System.out.println(total);
    }
}
