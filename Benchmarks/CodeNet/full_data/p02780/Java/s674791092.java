import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] dices = new int[n];
        double max = 0;
        for(int i = 0 ; i < n ; i++){
            dices[i] = scanner.nextInt();
            if((i + 1) < k){
                continue;
            }

            double dice = 0.0;
            for(int j = 0 ; j < k ; j++){
                dice += calc(dices[i - j]);
            }
            if(max < dice){
                max = dice;
            }
        }

        System.out.println(max);
    }

    static double calc (int n){
        double result = 0.0;
        for(int i = 1 ; i <= n ; i++){
            result += ((double)i) * (double)(1.0d / n);
        }
        return result;
    }

}