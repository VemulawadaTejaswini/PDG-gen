import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), K = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N; i++) arr.add(sc.nextInt());

        int ret = 0;
        for(int a : arr) {
            if(a >= K)
                ret += 1;
        }

        System.out.println(ret);
    }
}
//[B@25618e91
//[B@326de728
//