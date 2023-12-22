import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        ArrayList<Integer> list = new ArrayList<>
            (Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        x = x.substring(x.length() -2, x.length());
        int xx = Integer.parseInt(x);
        if(list.contains(Integer.valueOf(xx))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}