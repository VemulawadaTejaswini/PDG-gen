import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            d.add(sc.nextInt());
        }
        List<Integer> d_new = new ArrayList<>(new HashSet<>(d));
        System.out.println(d_new.size());
    }
}



