
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer d = Integer.parseInt(scanner.next());
        Integer[][] x = new Integer[n][d];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <d; j++ ) {
                x[i][j] = Integer.parseInt(scanner.next());
            }
        }

        int count = 0;
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(int i =0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int total = 0;
                for(int k = 0; k < d; k++) {
                    total += (int) Math.pow(x[i][k] - x[j][k], 2);
                }
                intList.add(total);
            }
        }

        count = 0;
        for (int i = 0; i < intList.size(); i++) {
            if ((Math.sqrt(intList.get(i)) == Math.floor(Math.sqrt(intList.get(i))))
                    && !Double.isInfinite(Math.sqrt(intList.get(i)))) {
                count++;
            }
        }

        System.out.println(count);
    }
}