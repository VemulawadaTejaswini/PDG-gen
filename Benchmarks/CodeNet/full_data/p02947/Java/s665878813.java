import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loopCount = Integer.parseInt(sc.next());
        
        List<String> strList = new ArrayList<>();

        for (int i = 0; i < loopCount; i++) {
            String str = sc.next();
            // 中の文字を並べ替えたい
            List<Character> strChar = new ArrayList<>();
            for (int j = 0; j < str.length(); j++) {
                strChar.add(str.charAt(j));
            }
            Collections.sort(strChar);
            String result = "";
            for (int k = 0; k < str.length(); k++) {
                result = result + strChar.get(k);
            }
            strList.add(result);
        }
        
        long matchCount = 0;
        for (int i = 0; i < (loopCount - 1); i++) {
            for (int j = i + 1; j < loopCount; j++) {
                if (strList.get(i).equals(strList.get(j))) {
                    matchCount++;
                }
            }
        }

        System.out.println(matchCount);
    }
}