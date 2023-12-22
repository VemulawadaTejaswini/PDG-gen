import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[n][2]; // idx,num
        for (int i = 0; i < n; i++) {
            a[i][0] = i;
            a[i][1] = sc.nextInt();
        }
        int lastIdx = -1;
        int curIdx = -1;
        int move = 0;
        int op = 0;
        StringBuilder sb = new StringBuilder();
        OUTER:while(move <= k){
            Arrays.sort(a, (x, y) -> y[1] - x[1]);
            for (int i = 0; i < n; i++) {
                if(a[i][0] != lastIdx){
                    if(a[i][1] > 0){
                        curIdx = a[i][0];
                        a[i][1]--;
                        sb.append(a[i][0]+1).append(" ");
                        op++;
                    }else{
                        break OUTER;
                    }
                }
            }
            move++;
            lastIdx = curIdx;
        }

        if (move > k) {
            System.out.println(op);
            System.out.println(sb.deleteCharAt(sb.length()-1).toString());
        }else{
            System.out.println("-1");
        }

        sc.close();
    }

}
