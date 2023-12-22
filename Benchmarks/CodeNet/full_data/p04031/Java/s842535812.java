import java.util.Scanner;

/**
 * Created by wild on 16/08/13.
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = scan.nextInt();
        }

        //平均値を取る
        int tmp = 0;
        for (int i = 0; i < n; i++){
            tmp += num[i];
        }
        int average = 0;
        if (tmp%2 == 0){
            average = tmp/n;
        }else {
            if (tmp < 0){
                average = tmp/n - 1;
            }else {
                average = tmp/n + 1;
            }
        }


        //分散
        int result = 0;
        for (int i = 0; i < n; i++){
            result += Math.pow(num[i]-average,2);
        }

        System.out.println(result);
    }
}
