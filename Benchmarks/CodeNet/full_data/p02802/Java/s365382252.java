
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yoshizaki
 *151
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<String>();
        int qcount = scanner.nextInt();
        int submitCount = scanner.nextInt();
        for (int i = 1 ; i <= submitCount ; i++) {
            scanner.nextLine();
            deque.push(scanner.next());
            deque.push(scanner.next());
        }
        
        int ac = 0;
        int wa = 0;
        int waMemo = 0;
        String qnum = "";
        String  result = "";
        Map<String,String> submitted = new HashMap<String,String>();
        
        while (deque.peek() != null) {
            qnum = deque.pollLast();
            result = deque.pollLast();
            // 正解済みなら何もしない。
            if (submitted.containsKey(qnum)) {
                continue;
            }
            // 正解してなくてWAなら誤答数を1増やす。
            if (result.equals("WA")) {
                waMemo++;
                continue;
            }
            // 正解した時に正答数を１増やす、正解した問題を記録する。
            if (result.equals("AC")) {
                ac++;
                submitted.put(qnum, result);
                wa = wa + waMemo;
                waMemo = 0;
                continue;
            }
            
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ac).append(" ").append(wa);
        System.out.println(sb.toString());
    }
}