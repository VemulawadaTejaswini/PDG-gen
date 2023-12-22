import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        char[] arr = sc.next().toCharArray();

        long ans = 0;

        int cntR = 0;
        int cntG = 0;
        int cntB = 0;

        for (int i=0; i<n; i++) {
            if (arr[i]=='R') ++cntR;
            if (arr[i]=='G') ++cntG;
            if (arr[i]=='B') ++cntB;
        }

        ans = cntR * cntG * cntB;

        for (int i=0; i<n-2; i++) {
            inner:
            for (int j=i+1; j<n-1; j++) {
                int idx = j+(j-i);
                if (idx>=n) continue inner;
                if (arr[i]!=arr[j] && arr[j]!=arr[idx] && arr[idx]!=arr[i]) ans--;
            }
        }

        System.out.println(ans);
    }

}
