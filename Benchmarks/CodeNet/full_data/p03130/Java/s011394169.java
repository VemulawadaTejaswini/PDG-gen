import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];
        int[] count = new int[4];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            count[a[i]]++;
            count[b[i]]++;
        }

        List<Integer> countlist = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            countlist.add(count[i]);
        }


        if (countlist.contains(3) || countlist.contains(0)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}





