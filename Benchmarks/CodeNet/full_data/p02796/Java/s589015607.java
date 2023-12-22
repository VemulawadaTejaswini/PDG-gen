import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Robot[] robots = new Robot[n];
        for (int i = 0; i < n; i++) {
            robots[i] = new Robot(br.readLine());
        }
        Arrays.sort(robots);
        int count = 0;
        int left = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (left <= robots[i].left) {
                count++;
                left = robots[i].right;
            }
        }
        System.out.println(count);
    }

    static class Robot implements Comparable<Robot> {
        int point;
        int length;
        int left;
        int right;
        
        public Robot (String arg) {
            String[] arr = arg.split(" ", 2);
            point = Integer.parseInt(arr[0]);
            length = Integer.parseInt(arr[1]);
            left = point - length;
            right = point + length;
        }
        
        public int compareTo(Robot another) {
            return right - another.right;
        }
    }
}
