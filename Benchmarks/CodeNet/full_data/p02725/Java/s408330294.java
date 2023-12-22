import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        int n= sc.nextInt();
        int max = 0;
        int sum = 0;
        int past = 0;
        for (int i = 0; i < n; i++) {
            int cur = sc.nextInt();
            int dis = cur - past;
            sum += dis;
            max = Math.max(max, dis);
            past = cur;
        }
        int last_dis = k - past;
        sum += last_dis;
        max = Math.max(max, last_dis);
        System.out.println(sum - max);
    }
}
