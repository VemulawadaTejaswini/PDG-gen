import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt()*(-1);
        Arrays.sort(arr);
        for (int i=0; i<n; i++) arr[i] *= (-1);

        int ans = 1;

        for (int i=0; i<n-1; i++) {
            if (arr[i]>arr[i+1]) ans++;
        }

        out.print(ans);
        out.flush();



    }

}
