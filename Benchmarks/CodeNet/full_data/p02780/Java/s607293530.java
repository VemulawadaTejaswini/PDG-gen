import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double[] dice = new double[n];
        for(int i = 0; i < n; i++){
            dice[i] = ExpectOfEachDice(sc.nextInt());
        }
        //System.out.println(Arrays.toString(dice));

        double maxExpect = 0;
        double tempExpect = 0;
        for(int i = 0; i < n-k+1; i++ ){
            for (int j = i; j< i+k; j++){
                tempExpect += dice[j];
            }
            maxExpect = Math.max(maxExpect, tempExpect);
            tempExpect = 0;
        }

        System.out.println(maxExpect);
    }

    public static double ExpectOfEachDice(int n){
        if (n%2==1){
            return ((n/2)+1.0);
        }else {
            return ((n/2.0)+0.5);
        }
    }
}