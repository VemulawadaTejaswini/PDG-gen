import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    final String sNum = sc.next();
    final String[] sArray = sNum.split("");
    final List<String> listStr = new LinkedList<String>();
    boolean bResult = false;
    String sResult;
    int listSize = 0;
    int iResultCnt = 0;
    for (int ii = 0; ii < sArray.length; ii++) {

      // 小文字かどうか比較
      if (!sArray[ii].toLowerCase().equals(sArray[ii])) {
        if (ii == 0 && "A".equals(sArray[ii])) {
          bResult = true;
          continue;
        }

        if (ii == 1 && "C".equals(sArray[ii])) {
          iResultCnt++;
          continue;
        }

        // 先頭から3文字目 かつ 末尾から2文字目の間
        if (ii >= 2 && ii <= sArray.length - 2) {
          if ("C".equals(sArray[ii])) {
            iResultCnt++;
            continue;
          }
        } else {
          listStr.add(sArray[ii]);
        }
      } else {
        listStr.add(sArray[ii]);
      }
    }
    listSize = listStr.size();
    if (bResult && 1 == iResultCnt && sArray.length - 2 == listSize) {
      sResult = "AC";
    } else {
      sResult = "WA";
    }
    System.out.print(sResult);
  }
}
