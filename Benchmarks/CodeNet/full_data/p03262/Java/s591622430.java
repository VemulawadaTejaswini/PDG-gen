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
        int min = 100000000;
        if (citiesPos.length == 1) {
            min = Math.abs(citiesPos[0] - X);
        }else {
            for (int cityPos : citiesPos) {
                min = Math.min(min, Math.abs(X - cityPos));
            }
        }
        System.out.println(min);
    }
}