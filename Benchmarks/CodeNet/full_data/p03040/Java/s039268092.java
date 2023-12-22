import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(reader.readLine());
        SortedSet<Integer> aset = new TreeSet<>();
        long b = 0L;
        for (int i = 0; i < q; i++) {
            String line = reader.readLine();
            System.out.println("line=" + line);
            if (line.charAt(0) == '1') {
                String[] array = line.split(" ");
                aset.add(Integer.parseInt(array[1]));
                b += Integer.parseInt(array[2]);
            } else {
                int size = aset.size();
                Integer[] array = aset.toArray(new Integer[0]);
                int x = array[size / 2 - (size % 2 == 0 ? 1 : 0)];
                long sum = b;
                for (int j = 0; j < size; j++) {
                    sum += Math.abs(array[j] - x);
                }
                System.out.println(x + " " + sum);
            }
        }
    }
}
