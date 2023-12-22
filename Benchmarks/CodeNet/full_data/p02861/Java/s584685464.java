import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> z;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] za = new double [n][2];
        String s = "";
        for (int i = 0; i < n; i++) {
            za[i][0] = sc.nextDouble();
            za[i][1] = sc.nextDouble();
            s += i;
        }
        z = new ArrayList<>();
        permutation(s,"");
        double ans = 0.0;
        List<Double> l = new ArrayList<>();
        for(int i = 0; i < z.size(); i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++) {
                list.add(Integer.parseInt(z.get(i).substring(j, j+1)));
            }
            double total = 0.0;
            for(int j=0; j<n-1; j++) {
                double a = za[list.get(j)][0] - za[list.get(j + 1)][0];
                double b = Math.pow(a, 2);
                double c = za[list.get(j)][1] - za[list.get(j + 1)][1];
                double d = Math.pow(c, 2);
                double e = Math.sqrt(b + d);
                total += e;
            }
            l.add(total);
        }
        for (Double double1 : l) {
            ans += double1;
        }
        System.out.println(ans / (l.size() + 0.0));
    }

    public static void permutation(String q, String ans){
        if(q.length() <= 1) {
            z.add(ans + q);
         }
         else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                ans + q.charAt(i));
            }
         }
    }
}