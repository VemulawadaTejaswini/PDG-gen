import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] field = new char[h][];
        for (int i = 0; i < h; i++) {
            field[i] = sc.next().toCharArray();
        }
        int start = -1;
        for (int i = 0; i < h && start == -1; i++) {
            for (int j = 0; j < w; j++) {
                if (field[i][j] == '.') {
                    start = i * 100 + j;
                    break;
                }
            }
        }
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        ArrayDeque<Integer> next = new ArrayDeque<>();
        int[][] first = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(first[i], -1);
        }
        deq.add(start);
        int max1Idx = 0;
        int count1 = 0;
        while (deq.size() > 0) {
            while (deq.size() > 0) {
                int x = deq.poll();
                int hh = x / 100;
                int ww = x % 100;
                if (field[hh][ww] == '.' && first[hh][ww] == -1) {
                    max1Idx = x;
                    first[hh][ww] = count1;
                    if (hh > 0) {
                        next.add((hh - 1) * 100 + ww);
                    }
                    if (hh < h - 1) {
                        next.add((hh + 1) * 100 + ww);
                    }
                    if (ww > 0) {
                        next.add(hh * 100 + ww - 1);
                    }
                    if (ww < w - 1) {
                        next.add(hh * 100 + ww + 1);
                    }
                }
            }
            count1++;
            ArrayDeque<Integer> tmp = next;
            next = deq;
            deq = tmp;
        }
        int[][] second = new int[h][w];
        for (int i = 0; i < h; i++) {
            Arrays.fill(second[i], -1);
        }
        deq.add(max1Idx);
        int maxCount = 0;
        int count2 = 0;
        while (deq.size() > 0) {
            while (deq.size() > 0) {
                int x = deq.poll();
                int hh = x / 100;
                int ww = x % 100;
                if (field[hh][ww] == '.' && second[hh][ww] == -1) {
                    maxCount = count2;
                    second[hh][ww] = count2;
                    if (hh > 0) {
                        next.add((hh - 1) * 100 + ww);
                    }
                    if (hh < h - 1) {
                        next.add((hh + 1) * 100 + ww);
                    }
                    if (ww > 0) {
                        next.add(hh * 100 + ww - 1);
                    }
                    if (ww < w - 1) {
                        next.add(hh * 100 + ww + 1);
                    }
                }
            }
            count2++;
            ArrayDeque<Integer> tmp = next;
            next = deq;
            deq = tmp;
        }
        System.out.println(maxCount);
    }
}