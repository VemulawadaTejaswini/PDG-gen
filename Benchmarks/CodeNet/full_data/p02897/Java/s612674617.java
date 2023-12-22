import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int oddCnt = N / 2 + N % 2;

        double ret = oddCnt / (double)N;
        System.out.print(ret);
    }
}
//[B@25618e91
//[B@326de728
//