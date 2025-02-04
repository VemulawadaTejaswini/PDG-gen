
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer k = Integer.parseInt(scanner.next());
        Integer n = Integer.parseInt(scanner.next());

        Integer[] total = new Integer[n];
        for(int i = 0; i < n; i++) {
            total[i] = Integer.parseInt(scanner.next());
        }


        List<Integer> kyori = new ArrayList<Integer>();
        for(int i = 0; i < n-1; i++) {
            kyori.add(Math.abs(total[i] - total[i+1]));
        }
        kyori.add(k - total[n-1]);
        Collections.sort(kyori);
        kyori.remove(kyori.size() - 1);

        int sum = 0;
        for(int i = 0; i < kyori.size(); i++) {
            sum += kyori.get(i);
        }

        System.out.println(sum);
    }
}
