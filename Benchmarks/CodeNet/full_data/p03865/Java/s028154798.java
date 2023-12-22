import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int depth = 0;
        int currentLength = s.length();
        Queue<String> queue  = new ArrayDeque<>();
        queue.add(s);

        outer: while (true) {
            String next = queue.poll();
//            System.out.println(next);
            if (currentLength != next.length()) {
                depth++;
                currentLength--;
            }

            boolean hasNext = false;
            for (int i = 1; i < next.length() - 1; i++) {
                if (next.length() == 2)
                    break outer;
                if (next.charAt(i-1) != next.charAt(i+1)) {

                    String nextString = next.substring(0,i) + next.substring(i+1);
                    queue.add(nextString);
                    hasNext = true;
                }
            }
            if (!hasNext) break;
        }

//        System.out.println(depth);
        System.out.println(depth % 2 == 1 ? "First" : "Second");
    }
}

