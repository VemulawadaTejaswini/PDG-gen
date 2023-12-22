import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt(); //塔1
        int t2 = sc.nextInt(); //塔2
        int res = 0;
        for (int i=1;i<999;i++){
            if (i == t2 - t1){
                int t0=0;
                for (int j = 1; j < i; j++){
                    t0 += j;
                }
                res = t0 - t1;
                break;
            }
        }
        System.out.println(res);
    }
}
