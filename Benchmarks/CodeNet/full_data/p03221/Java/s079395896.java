import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] y = new int[m];
        int[][] maze = new int[m][2];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
            y[i] = sc.nextInt();
            maze[i][0] = p[i];
            maze[i][1] = y[i];
        }
        // int[] number = new int[m];
        // int num = 0;
        for (int i = 0; i < n; i++) {
            java.util.List<Integer> list = new ArrayList<Integer>();
            // java.util.List<Integer> tag = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                if (p[j] - 1 == i) {
                    list.add(y[j]);
                    // System.out.println(y[j]);
                    // tag.add(j);
                }
            }
            java.util.Collections.sort(list);
            for (int j = 0; j < list.size(); j++) {
                // System.out.println(list.get(j));
                // System.out.println(y[k]);
                for (int k = 0; k < m; k++) {
                    int a = list.get(j);
                    if (a == y[k]) {
                        maze[k][1] = j + 1;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            DecimalFormat dformat = new DecimalFormat("000000");
            System.out.print(dformat.format(p[i]));
            System.out.println(dformat.format(maze[i][1]));
        }
    }
}