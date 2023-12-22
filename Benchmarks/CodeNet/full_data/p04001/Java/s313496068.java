import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] values = Stream.of(sc.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        long ret = 0;
        
        final int max = 1 << values.length - 1;
        for (int i = 0; i < max; i++) {
            int st = 0;
            for (int j = 0; j < values.length; j++) {
                if((i & (1 << j)) != 0){
                    ret += calculate(st, j, values);
                    st = j + 1;
                }
            }
            ret += calculate(st, values.length - 1, values);
        }
        System.out.println(ret);
    }

    private static long calculate(int s, int e, int[] values){
        //out.println(s+" "+e);
        long v = 0;
        for (int i = s; i <= e; i++) {
            v = v * 10 + values[i];
        }
        return v;
    }
}