import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int m = n;
        double[][] arr = new double[n][2];
        for (int i=0; i<n; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
        }

        double sum = 0;


        int cnt = 0;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                double tmp = Math.sqrt(Math.pow(arr[i][0]-arr[j][0], 2) + Math.pow(arr[i][1]-arr[j][1], 2));
//                System.out.println(tmp);
                sum += tmp;
                cnt++;
            }
        }

        int calc = n;
        while (1 < n--) {
            calc *= n;
        }

        int copyCalc = calc;
        calc *= (m-1);
        calc /= cnt;

//        System.out.println(calc);
//        System.out.println(copyCalc);

        System.out.println(sum * (double)(calc) / (double)copyCalc);

    }


}
