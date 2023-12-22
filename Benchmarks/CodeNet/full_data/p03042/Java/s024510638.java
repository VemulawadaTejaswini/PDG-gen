import java.util.*;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String strArr[] = str.split("");
        int numArr[] = new int[4];

        for (int i = 0; i < 4; i++){
            numArr[i] = Integer.valueOf(strArr[i]);
        }

        Boolean isYYMM = false;
        Boolean iSMMYY = false;

        isYYMM = isYYMM(numArr);
        iSMMYY = isMMYY(numArr);

        if (isYYMM && iSMMYY) {
            System.out.println("AMBIGUOUS");
        } else if (isYYMM) {
            System.out.println("YYMM");
        } else if (iSMMYY) {
            System.out.println("MMYY");
        } else {
            System.out.println("NA");
        }
    }

    static Boolean isYYMM(int[] numArr) {
        Boolean isYYMM = true;
        String month = Integer.toString(numArr[2]) + Integer.toString(numArr[3]);

        if (Integer.valueOf(month) > 12) {
            isYYMM = false;
        } else if (Integer.valueOf(month) == 0) {
            isYYMM = false;
        }
        return isYYMM;
    }

    static Boolean isMMYY(int[] numArr) {
        Boolean isMMYY = true;
        String month = Integer.toString(numArr[0]) + Integer.toString(numArr[1]);

        if (Integer.valueOf(month) > 12) {
            isMMYY = false;
        } else if (Integer.valueOf(month) == 0) {
            isMMYY = false;
        }

        return isMMYY;
    }
}