import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> numberList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numberList.add(Long.parseLong(sc.next()));
        }

        List<int[]> combination = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] combi = { i, j };
                combination.add(combi);
            }
        }

        long sum = 0;
        for (int[] combi : combination) {
            sum += numberList.get(combi[0]) ^ numberList.get(combi[1]);
        }

        System.out.println(sum % 1000000007);
    }
}
