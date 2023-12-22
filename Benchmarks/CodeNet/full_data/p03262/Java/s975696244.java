import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] citiesPos = new int[N];

        for (int i = 0; i < N; i++) {
            citiesPos[i] = sc.nextInt();
        }

        Arrays.sort(citiesPos);
        int min = 1000000000;
        if (citiesPos.length == 1) {
            min = Math.abs(citiesPos[0] - X);
        }else {
            for (int cityPos : citiesPos) {
                min = Math.min(min, Math.abs(X - cityPos));
            }
        }

        boolean indivisibleFlg = false;
        for (int cityPos : citiesPos) {
            if (indivisibleFlg) {
                break;
            }
            if ((cityPos - X) % min != 0) {
                indivisibleFlg = true;
            }
        }
        
        if (indivisibleFlg) {
            int ans = 0;
            for (int i = min - 1; i > 0; i--) {
                boolean answerFlg = true;
                for (int j = 0; j < citiesPos.length; j++) {
                    if (citiesPos[j] % i != 0) {
                        answerFlg = false;
                    }
                }
                if(answerFlg){
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
        } else {
            System.out.println(min);
        }
    }
}