import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        char[] arr = sc.next().toCharArray();
        int cnt = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]=='7') cnt++;
        }

        if (cnt==0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }


    }
}
