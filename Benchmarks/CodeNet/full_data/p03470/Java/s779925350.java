import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<num; i++){
            int in = sc.nextInt();
            set.add(in);
        }
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);

        System.out.println(list.size());
    }
}
