import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String direction = sc.next();
        String[] ways = direction.split("");
        int[] children = new int[ways.length];
        for (int i = 0; i < ways.length; i++) {
            children[i] = 1;
        }
        long count = 0;
        double limit = Math.pow(10, 100);
        while (count < limit) {
            int[] array = new int[ways.length];
            for (int i = 0; i < ways.length; i++) {
                if (i == 0) {
                    if (ways[i + 1].equals("L")) {
                        array[i] = children[i + 1];
                    }
                } else if (i == ways.length - 1) {
                    if (ways[i - 1].equals("R")) {
                        array[i] = children[i - 1];
                    }
                } else {
                    int total = 0;
                    if (ways[i - 1].equals("R")) {
                        total += children[i - 1];
                    }
                    if (ways[i + 1].equals("L")) {
                        total += children[i + 1];
                    }
                    array[i] = total;
                }
            }
            children = array;
            count++;
        }
        for (int i: children) {
            System.out.print(i + " ");
        }
    }
}
