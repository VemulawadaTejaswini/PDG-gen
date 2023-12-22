import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(reader.readLine());
        List<Integer> alist = new ArrayList<>(q);
        long b = 0L;
        for (int i = 0; i < q; i++) {
            String line = reader.readLine();
            if (line.charAt(0) == '1') {
                String[] array = line.split(" ");
                alist.add(Integer.parseInt(array[1]));
                b += Integer.parseInt(array[2]);
            } else {
                alist.sort(Comparator.naturalOrder());
                int size = alist.size();
                int x = alist.get(size / 2 - (size % 2 == 0 ? 1 : 0));
                long sum = b;
                for (int j = 0; j < size; j++) {
                    sum += Math.abs(alist.get(j) - x);
                }
                System.out.println(x + " " + sum);
            }
        }
    }
}
