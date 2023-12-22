import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_text = scanner.nextLine();
        String[] data = input_text.split(" ");
        int N = Integer.parseInt(data[0]);
        int K = Integer.parseInt(data[1]);
        input_text = scanner.nextLine();
        data = input_text.split(" ");
        long[] array = new long[N];
        for(int i = 0; i < N; i++) {
            array[i] = Long.parseLong(data[i]);
        }

        int type = N * (N - 1) / 2;
        List<Long> ar = new ArrayList<>();

        int f = 0;
        int j = 1;
        for(int i = 0; i < type; i++) {
            ar.add(array[f] * array[j]);

            j++;
            if(j == N) {
                f++;
                j = f + 1;
            }
        }

        Collections.sort(ar);
        System.out.println(ar.get(K - 1));

        scanner.close();
    }

}