
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        // 整数の入力
        // final int a = sc.nextInt();
        // 文字列の入力
        // final String s1 = sc.next();
        final int n = sc.nextInt();
        sc.close();
        String[] alphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> resultTmp = new ArrayList<String>();
        // 文字数全体ループ
        for (int i = 0; i <= n; i++) {
            // 後ろに追加する文字ループ
            for (int j = 0; j < i; j++) {
                if (result.size() == 0) {
                    resultTmp.add(alphabets[0]);
                } else {
                    for (int k = 0; k < result.size(); k++) {
                        resultTmp.add(result.get(k) + alphabets[j]);
                    }
                }
            }

                result.clear();
                result.addAll(resultTmp);
                Collections.sort(result);
                resultTmp.clear();
        } 
        
            for(String a : result){
            System.out.println(a);
            
        }
    }
}
