
import javax.swing.text.StringContent;
import java.util.*;

public class Main {

    /* チェックリスト
     * 結果はintの範囲を超えていませんか？(必要な時以外はlongを使いましょう)
     * TLEしそうな処理はありませんか？
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = Integer.parseInt(sc.nextLine());
        List<Integer> input = new ArrayList<Integer>();
        for(long i = 0; i < n - 1;i++){
            input.add(Integer.parseInt(sc.next()));
        }
        long max = 0;
        //nが3
        //3回試行して 2 2 5
        int cur = 0;
        long prev = Integer.MAX_VALUE;
        long r = 0;
        for(int i : input){
            if(i > prev){
                r += prev;
            }else{
                r += i;
            }
            prev = i;
            cur++;
        }
        System.out.println(r + input.get(input.size() - 1));
    }
}