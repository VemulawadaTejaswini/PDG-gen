import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        check(num);
    }

    public static void check(String num) {

        String[] strs = num.split(" ");
        int start = Integer.parseInt(strs[1]) - Integer.parseInt(strs[0])+1;
        int end = Integer.parseInt(strs[1]) + Integer.parseInt(strs[0])-1;
        for(int i=start; i<=end; i++) {
            System.out.print(i);
            if(i < end) {
                System.out.print(" ");
            }
        }
    }
}