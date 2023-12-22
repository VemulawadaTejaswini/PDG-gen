import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String yyyyMMDD = sc.next();
        String[] arrays = yyyyMMDD.split("/");
        int year = Integer.valueOf(arrays[2]);
        int month = Integer.valueOf(arrays[1]);

        if (year > 2019) {
            System.out.println("TBD");
            return;
        }
        if (month > 4) {
            System.out.println("TBD");
            return;
        }
        System.out.println("Heisei");
    }
}