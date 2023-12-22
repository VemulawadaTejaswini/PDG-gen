import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<num; i++){
            list.add(Integer.numberOfTrailingZeros(sc.nextInt()));
        }

        System.out.println(Collections.min(list));

//        System.out.println(Integer.numberOfTrailingZeros(num));
    }
}
