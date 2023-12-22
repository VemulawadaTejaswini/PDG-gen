import java.util.*;


public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        String[] key = new String[N];
        Integer[] val = new Integer[N];

        for (int i = 0; i < N; i++) {
            key[i] = scanner.next();
            val[i] = 0;
        }

        Arrays.sort(key);

        String tmp = null;
        Integer count = 0;
        Integer max = 0;
        for (int i = 0; i < N; i++) {
            if(key[i].equals(tmp)){
                count++;
                val[i] = count;
                max = Math.max(max, count);
            } else {
               tmp = key[i];
               count =0;
            }
        }
        for (int i = 0; i < N; i++) {
            if(val[i] == max) System.out.println(key[i]);
        }
    }
}