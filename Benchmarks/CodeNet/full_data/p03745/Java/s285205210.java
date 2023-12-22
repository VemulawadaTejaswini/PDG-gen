import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int intCnt = Integer.parseInt(br.readLine());
        String[] lineArray = br.readLine().split(" ");

        int intResultCnt = 0;
        int intBefore = 0;
        String strFlg = "";

        for (int i = 0; i < lineArray.length; i++) {
            int intTmp = Integer.parseInt(lineArray[i]);

            if (intTmp > intBefore) {
                if (!"+".equals(strFlg)) {
                    intResultCnt++;
                }
                strFlg = "+";
            }
            if (intTmp < intBefore) {
                if ("+".equals(strFlg)) {
                    strFlg = "-";
                } else if ("-".equals(strFlg)) {
                    intResultCnt++;
                    strFlg = "--";
                }
            }
            intBefore = intTmp;
        }

        if ("-".equals(strFlg)) {
            intResultCnt += 1;
        }
        System.out.println(intResultCnt);

    }
}