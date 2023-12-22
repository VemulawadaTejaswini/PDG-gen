
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        int[] shohin = new int[num];
        int sum = 0;
        int sumFlg = 0;
        if(m == 0){
            System.out.println("No");
        }
        for (int i = 0; i < num; i++){
            shohin[i] = sc.nextInt();
            sum = sum + shohin[i];
        }
        for (int k = 0; k < num - 1; k++){
            for (int l = k + 1; l < num - 1; l++){
                if(shohin[k] < shohin [l]){
                    int tmp = shohin[k];
                    shohin[k] = shohin[l];
                    shohin[l] = tmp;
                }
            }
        }
        for (int j = 0; j < m; j++){
            if(shohin[j] < (sum / (4 * m))){
            }else {
                sumFlg = sumFlg + 1;
            }
        }
        if (sumFlg == m){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
