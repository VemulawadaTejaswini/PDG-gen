import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] upper = new int[n];
        int[] lower = new int[n];

        for(int i = 0; i < n; i++){
            upper[i] = sc.nextInt();
        }
        int maxSum = upper[0];
        for(int j = 0; j < n; j++){
            lower[j] = sc.nextInt();
            maxSum += lower[j];
        }

        int tmpSum = maxSum;
        for(int k = 1; k < n; k++){
            tmpSum +=  (upper[k] - lower[k-1]);
            if(tmpSum > maxSum){
                maxSum = tmpSum;
            }
        }
        System.out.println(maxSum);
    }

}