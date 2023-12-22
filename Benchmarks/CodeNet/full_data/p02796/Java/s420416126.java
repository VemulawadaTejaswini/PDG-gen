import java.util.*;

public class Main {
    static final int MAXV = 1000000000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Robot[] robots = new Robot[n];
        for(int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            int l = sc.nextInt();
            int left = x - l;
            int right = x + l;
            robots[i] = new Robot(left, right);
        }

        Arrays.sort(robots);

        int ans = 0;
        int cur = -MAXV;
        for(int i = 0; i < n; ++i) {
            if(cur <= robots[i].left) {
                ++ans;
                cur = robots[i].right;
            }
        }
        System.out.println(ans);
    }
}

class Robot implements Comparable<Robot> {
    int left;
    int right;

    public Robot(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(Robot other) {
        return this.right - other.right;
    }
}