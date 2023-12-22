import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mCnt = 0;
        long aCnt = 0;
        long rCnt = 0;
        long cCnt = 0;
        long hCnt = 0;
        for (int i = 0; i < n; i++) {
            char top = sc.next().charAt(0);
            switch (top) {
                case 'M':
                    mCnt++;
                    break;
                case 'A':
                    aCnt++;
                    break;
                case 'R':
                    rCnt++;
                    break;
                case 'C':
                    cCnt++;
                    break;
                case 'H':
                    hCnt++;
                    break;
                default:
                    // not add
            }
        }

        //mar;
        long mar = mCnt * aCnt * rCnt;
        //mac;
        long mac = mCnt * aCnt * cCnt;
        //mah;
        long mah = mCnt * aCnt * hCnt;
        //mrc;
        long mrc = mCnt * rCnt * cCnt;
        //mrh;
        long mrh = mCnt * rCnt * hCnt;
        //mch;
        long mch = mCnt * cCnt * hCnt;
        //arc;
        long arc = aCnt * rCnt * cCnt;
        //arh;
        long arh = aCnt * rCnt * hCnt;
        //ach;
        long ach = aCnt * cCnt * hCnt;
        //rch;
        long rch = rCnt * cCnt * hCnt;

        System.out.println(mar + mac + mah + mrc + mrh + mch + arc + arh + ach + rch);
    }
}