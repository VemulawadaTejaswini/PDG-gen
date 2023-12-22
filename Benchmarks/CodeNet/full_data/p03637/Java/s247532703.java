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

        int cntFour = 0;
        int cntTwo = 0;

        for (int i=0; i<n; i++) {
            if (arr[i]%4==0) {
                cntFour++;
            } else if (arr[i]%2==0) {
                cntTwo++;
            }
        }

        if ((n/2<=cntFour && 0<cntFour) || ((n-cntTwo+1)/2<=cntFour)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
