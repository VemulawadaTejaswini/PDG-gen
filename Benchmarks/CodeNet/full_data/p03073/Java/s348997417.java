import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> input = Arrays.stream(sc.nextLine().split("")).map(e -> Integer.valueOf(e)).collect(Collectors.toList());

        int start0 = 0;
        int start0TargetNum = 0;
        int start1 = 0;
        int start1TargetNum = 1;

        for (int tar : input) {
            if (tar != start0TargetNum) start0++;
            if (tar != start1TargetNum) start1++;

            start0TargetNum = change(start0TargetNum);
            start1TargetNum = change(start1TargetNum);
        }

        if (start0 < start1) {
            System.out.println(start0);
        } else {
            System.out.println(start1);
        }
    }

    public static int change(int tar) {
        int res = 0;
        if (tar == 0) {
            res = 1;
        } else {
            res = 0;
        }
        return res;
    }
}
