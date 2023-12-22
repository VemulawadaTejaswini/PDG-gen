
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ball = new int[num];
        for (int i = 0; i < ball.length; i++){
            ball[i] = sc.nextInt();
        }
        for (int i = 0; i < ball.length; i++){
            int count = 0;
            int result = 0;
            for (int j = 0; j < ball.length; j++){
                if (i == j){
                    continue;
                }
                for (int k = j; k < ball.length - 2; k++){
                    if (k == i){
                        continue;
                    }
                    if (ball[k] == ball[k + 1]){
                        count++;
                    }
                }
                result = count * (count - 1) / 2;
            }
            System.out.println(result);
        }
    }
}