import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Queue<Character> str = new ArrayDeque<>();
        char[] str_l = s.toCharArray();
        for (int i = 0; i < str_l.length; i++) {
            str.add(str_l[i]);
        }
        int q = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < q; i++) {
            String[] line = sc.nextLine().split(" ");
            int t = Integer.parseInt(line[0]);
            if (t == 1) {
                char first = ((ArrayDeque<Character>) str).pollFirst();
                char last = ((ArrayDeque<Character>) str).pollLast();
                ((ArrayDeque<Character>) str).addLast(first);
                ((ArrayDeque<Character>) str).addFirst(last);
            } else if (t == 2) {
                int f = Integer.parseInt(line[1]);
                char c = line[2].toCharArray()[0];
                if (f == 1) {
                    ((ArrayDeque<Character>) str).addFirst(c);
                } else if (f == 2) {
                    ((ArrayDeque<Character>) str).addLast(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        str.forEach(r -> sb.append(r));
        System.out.println(sb.toString());
    }
}