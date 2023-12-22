import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();

        int cnt = 1;

        for (int i=0; i<n-1; i++) {
            if (arr[i]!=arr[i+1]) cnt++;
        }

        System.out.println(cnt);
    }

}
