import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        //String line = sc.nextLine();
        check(num);
    }

    public static void check(String num) {

        String[] strs = num.split(" ");
        int a1 = Integer.parseInt(strs[0]) + Integer.parseInt(strs[1]);
        int a2 = Integer.parseInt(strs[0]) - Integer.parseInt(strs[1]);
        int a3 = Integer.parseInt(strs[0]) * Integer.parseInt(strs[1]);

        int max = 0;
        if(a1 >= a2) {
            max = a1;
        } else {
            max = a2;
        }
        if(a3 >= max) {
            System.out.println(a3);
        } else {
            System.out.println(max);
        }
    }
}