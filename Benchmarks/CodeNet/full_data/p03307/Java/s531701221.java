import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int result = 0;
        if (N % 2 == 0) {
            result = N;
        } else {
            result = N * 2;
        }

        System.out.println(result);
    }
}