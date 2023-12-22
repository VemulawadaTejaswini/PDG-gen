import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 標準入力から取得
        Scanner scan = new Scanner(System.in);
        // 取得した文字を格納する可変長リスト
        String[] scList = scan.nextLine().split("");
        
        int listSize = scList.length;
        
        int count = 0;
        for (int i = 0; i <= listSize - 3 ; i++) {
            String str = scList[i];
            for (int j = i + 1; j < listSize; j++) {
                str += scList[j];
                if (str.length() >= 4) {
                    double num = Double.parseDouble(str);
                    if (num >= 2019 && (num % 2019 == 0)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}