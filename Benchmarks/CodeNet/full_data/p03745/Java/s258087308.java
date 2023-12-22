import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by shoya on 2017/04/15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int ans = 0;
        int prev = -1;
        int upFlag = -1;
        for (int i = 0; i < n; i++){
            int curr = sc.nextInt();
            //System.out.printf("Prev %d Curr %d Up %d Ans %d\n", prev, curr, upFlag, ans);
            if (prev == -1) {
                prev = curr;
                continue;
            }
            if (upFlag == -1){
                if (curr > prev)
                    upFlag = 1;
                else if (curr < prev)
                    upFlag = 0;
                prev = curr;
                continue;
            }
            if ((upFlag == 1 && prev > curr) || (upFlag == 0 && prev < curr)){
                ans++;
                prev = curr;
                upFlag = -1;
                continue;
            }
            prev = curr;
        }

        //System.out.printf("Up %d Ans %d\n", upFlag, ans);
        pw.println(ans + 1);
        pw.flush();
        return;
    }