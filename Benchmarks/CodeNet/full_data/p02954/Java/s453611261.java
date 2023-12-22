
import java.util.*;

public class Main {

    /* チェックリスト
     * SNSに結果を書き込むときはACかWAかのみ(半分だけACとかは書かないこと)
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        List<String> map = new ArrayList<String>();
        int[] children;
        for(char c : in.toCharArray()){
            map.add(String.valueOf(c));
        }
        children = new int[map.size()];
        for(int i = 0;i<children.length;i++){
            children[i] = 1;
        }
        for(int i = 0;i < map.size() / 2;i++){
            int[] currentChildren = children.clone();
            for(int j = 0;j < children.length;j++){
                String arrow = map.get(j);
                if(children[j] != 0) {
                    int current = currentChildren[j];
                    if (arrow.equals("R")) {
                        children[j] -= current;
                        children[j + 1] += current;
                    } else {
                        children[j] -= current;
                        children[j - 1] += current;
                    }
                }
            }
        }
        String output = "";
        for(int i = 0;i < children.length;i++){
            output = output + " "+ children[i];
        }
        System.out.println(output.replaceFirst(" ",""));
    }
}