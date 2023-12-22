import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    double sum = 0;
    int n = sc.nextInt();
    double[][] arr = new double[n][2];

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int m = n;
        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
        }

        int calc = m;
        while (1 < m--) {
            calc *= m;
        }

//        System.out.println(calc);

        dfs("");

        System.out.println(sum / calc);


    }

    void dfs(String s) {
        if (s.length() == n) {
//            System.out.println(s);
            for (int i=0; i<n-1; i++) {
                int idx = s.charAt(i) - 48;
                int next = s.charAt(i+1) - 48;
                double tmp = Math.sqrt(Math.pow(arr[idx][0]-arr[next][0], 2) + Math.pow(arr[idx][1]-arr[next][1], 2));
                sum += tmp;
            }
        }
        else {
            for (int i=0; i<n; i++) {
                if (s.contains(String.valueOf(i))) continue;
                dfs(s + i);
            }
        }
    }


}
