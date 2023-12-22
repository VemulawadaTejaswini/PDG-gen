import java.util.*;

public class Main {

    static int q;
    static int n;
    static char[] charArr;
    static char[] tArr;
    static char[] dArr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        q = sc.nextInt();
        charArr = ("?" + sc.next() + "?").toCharArray();

        tArr = new char[q];
        dArr = new char[q];
        for (int i = 0; i < q; i++) {
            tArr[i] = sc.next().charAt(0);
            dArr[i] = sc.next().charAt(0);
        }

        int ans0 = 1;
        int ansN1 = n;

        int right = n + 1;
        int left = 0;

        // 0よう
        while (true) {
            if (right - left <= 1) {
                ans0 = left;
                break;
            }
            int middle = (right + left) / 2;
            if (check0(middle)) {
               left = middle;
            } else {
                right = middle;
            }
        }

        right = n + 1;
        left = 0;
        // n+1よう
        while (true) {
            if (right - left <= 1) {
                ansN1 = right;
                break;
            }
            int middle = (right + left) / 2;
            if (checkN1(middle)) {
                right = middle;
            } else {
                left = middle;
            }
        }


        System.out.println(ansN1 - ans0 - 1);

    }

    static boolean check0(int idx) {
        int currentIdx = idx;
        for (int i = 0; i < q; i++) {
            char t = tArr[i];
            char d = dArr[i];
            if (charArr[currentIdx] == t) {
                if (d == 'R') {
                    currentIdx++;
                } else {
                    currentIdx--;
                }
            }
            if (currentIdx == 0) {
                return true;
            } else if (currentIdx == n + 1){
                return false;
            }
        }
        return false;
    }

    static boolean checkN1(int idx) {
        int currentIdx = idx;
        for (int i = 0; i < q; i++) {
            char t = tArr[i];
            char d = dArr[i];
            if (charArr[currentIdx] == t) {
                if (d == 'R') {
                    currentIdx++;
                } else {
                    currentIdx--;
                }
            }
            if (currentIdx == n + 1) {
                return true;
            } else if (currentIdx == 0){
                return false;
            }
        }
        return false;
    }


}
