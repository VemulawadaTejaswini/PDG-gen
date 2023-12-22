import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());
        Integer[] delicious = new Integer[x];

        for(int i = 0; i < x; i++) {
            delicious[i] = Integer.parseInt(scanner.next());
        }

        int total = 0;
        for(int i = 0; i < x; i++) {
            for(int j = i+1; j < x; j++) {
                total += delicious[i] * delicious[j];
            }
        }

        System.out.println(total);
    }
}