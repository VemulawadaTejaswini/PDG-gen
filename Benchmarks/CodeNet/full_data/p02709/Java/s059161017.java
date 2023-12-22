import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static class An {
        public long v;
        public long n;

        public An(long v, int n) {
            this.v = v;
            this.n = n;
        }
    }

    public static final An Anchor = new An(-1, -1);

    public static final An Empty = new An(0, 0);

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long N = Integer.valueOf(s.nextLine());
        LinkedList<An> ans = new LinkedList<>();

        String[] anString = s.nextLine().split(" ");
        for (int i = 0; i < anString.length; i ++) {
            ans.add(new An(Long.parseLong(anString[i]), i + 1));
        }
        ans.add(Anchor);

        long left = 1;
        long right = anString.length;

        long happy = 0;
        An current = Empty;
        long currentHappy = -1;
        while(!ans.isEmpty()) {
            An head = ans.pop();

            if (head == Anchor) {
                long leftHappy = Math.abs(current.n - left);
                long rightHappy = Math.abs(current.n - right);
                if (leftHappy > rightHappy) {
                    //System.out.prlongln(current.v + ":" + current.n + " => move to left " + left + " (" + current.v*leftHappy + ")");
                    left++;
                    happy += current.v*leftHappy;
                } else {
                    //System.out.prlongln(current.v + ":" + current.n + " => move to right " + right + " (" + current.v*rightHappy + ")");
                    right--;
                    happy += current.v*rightHappy;
                }

                if (ans.isEmpty()) {
                    break;
                }

                ans.add(Anchor);
                current = Empty;
                currentHappy = -1;
                continue;
            }

            long headHappy = head.v*Math.max(Math.abs(head.n - left), Math.abs(head.n - right));

            if (headHappy > currentHappy) {
                if (current != Empty) {
                    ans.add(current);
                }
                current = head;
                currentHappy = headHappy;
            } else {
                ans.add(head);
            }
        }

        System.out.println(happy);
    }
}