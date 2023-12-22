import java.util.*;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int x_new = r * x - d;
            System.out.println(x_new);
            x = x_new;
        }
    }
}




