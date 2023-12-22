import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int mArr[] = new int[n];
        int cnt = 0;

        for (int i = 0; i < mArr.length; i++) {
            mArr[i] = sc.nextInt();
        }

        Arrays.sort(mArr);

        for (int i : mArr) {
            x -= i;
            cnt ++;
        }
        cnt += x / mArr[0];
        System.out.println(cnt);
    }
}