import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int menberCnt = n * 3;
        int[] aArr = new int[menberCnt];

        for (int i = 0; i < menberCnt; i++) {
            aArr[i] = sc.nextInt();
        }

        Arrays.sort(aArr);

        long lengthSum = 0;
        for (int i = (menberCnt-n)-1; i < (menberCnt-n)-1+n; i++) {// 真ん中の強さの人の強さを合計していく
            lengthSum += aArr[i];
        }

        System.out.println(lengthSum);
    }
}
