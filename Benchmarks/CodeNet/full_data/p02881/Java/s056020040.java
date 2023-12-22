import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            long num = in.nextLong();
            int sqr = (int) Math.ceil(Math.sqrt(num)) + 1;
            ArrayList<Long> arr = new ArrayList<>();
            arr.add(num - 1);
            for (int i = 1; i < sqr; i++){
                double p = (double) num / i;
                if (p == (int) p){
                    arr.add((long) p + i - 2);
                }
            }
            System.out.println(Collections.min(arr));
        }
    }
}
