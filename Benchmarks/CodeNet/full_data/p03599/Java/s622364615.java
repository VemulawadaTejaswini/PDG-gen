import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()*100;
        int b = sc.nextInt()*100;
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        ArrayList<Integer> sugar = new ArrayList<>();
        for(int i=0; i<=f; i++) {
            for(int j=0; j<=f; j++) {
                int tmp = i*c + j*d;
                if(tmp <= f) sugar.add(tmp);
            }
        }

        ArrayList<Integer> water = new ArrayList<>();
        for(int i=0; i<=f; i++) {
            for(int j=0; j<=f; j++) {
                int tmp = i*a + j*b;
                if(tmp <= f) water.add(tmp);
            }
        }

        double maxcon = 0.0;
        int ans1 = 0;
        int ans2 = 0;
        for(int i=0; i<water.size(); i++) {
            for(int j=0; j<sugar.size(); j++) {
                if(water.get(i) == 0 || sugar.get(j) == 0) continue;
                int sum = water.get(i) + sugar.get(j);
                if(sum <= f) {
                    double con = 100 * sugar.get(j) / sum;
                    if(water.get(i) / 100 * e >= sugar.get(j)) {
                        if(maxcon < con) {
                            maxcon = con;
                            ans1 = water.get(i) + sugar.get(j);
                            ans2 = sugar.get(j);
                        }
                    }
                }
            }
        }
        System.out.println(ans1 + " " + ans2);
    }
}
