import java.util.*;
import static java.lang.System.out;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int all = sc.nextInt();
        int num = sc.nextInt();
        int[] voteNum = new int[all];
        int sum = 0;
        for(int i=0;i<voteNum.length;i++) {
            voteNum[i] = sc.nextInt();
            sum += voteNum[i];
        }

        int cnt = 0;
        int border = sum/(4*num);
        for(int number : voteNum) {
            if(number > border) {
                //System.out.println(number);
                cnt++;
            }
        }
        if(cnt >= num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}