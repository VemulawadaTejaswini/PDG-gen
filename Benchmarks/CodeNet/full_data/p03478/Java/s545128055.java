import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//20
        int a = sc.nextInt();//2
        int b = sc.nextInt();//5
//        int n = 20;
//        int a = 2;
//        int b = 5;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            int res = 0;
            String str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++) {
                res += Character.getNumericValue(str.charAt(j));
            }
            if(a <= res && res <= b){
                list.add(i);
            }
        }

        int total = 0;
        for (Integer integer : list) {
            total += integer;
        }

        System.out.println(total);
    }
}
