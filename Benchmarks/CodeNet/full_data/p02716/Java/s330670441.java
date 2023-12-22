import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        long ans = 0;

        long[] arr = new long[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextLong();
//        Arrays.sort(arr);

        int cnt = n / 2;

        long ansS = 0;
        long ansT = 0;
        long ansTemp = 0;

        List<Long> list = new ArrayList<>();

        for (int i=0; i<n; i++) list.add(arr[i]);

        for (int i=n-1; i>=n-1-(cnt-1)*2; i-=2) {
            ansS += arr[i];
        }
        for (int i=n-2; i>=n-2-(cnt-1)*2; i-=2) {
            ansT += arr[i];
        }
        for (int i=n-3; i>=n-3-(cnt-1)*2; i-=2) {
            ansTemp += arr[i];
        }

//        System.out.print(ansS);
//        System.out.print(ansT);

        System.out.println(Math.max(Math.max(ansS, ansT), ansTemp));
//        System.out.print(list);


    }

}
