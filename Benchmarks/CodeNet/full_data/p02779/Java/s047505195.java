import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int cnt = 0;

        for (int i=0; i<n-1; i++) {
            if (arr[i]==arr[i+1]) cnt++;
        }

        if (cnt==0) {
            System.out.println("YES\n");
        } else {
            System.out.println("NO\n");
        }

    }

}
