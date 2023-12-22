import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        Queue<String> queue = new LinkedList<>();
        queue.add(String.valueOf(S.charAt(0)));
        for (int i = 1; i < S.length(); i++) {
            String ch = String.valueOf(S.charAt(i));

            List<String> list = new ArrayList<>();
            while(!queue.isEmpty()){
                String val = queue.remove();
                list.add(val + ch);
                list.add(val + "+" + ch);
            }
            queue.addAll(list);
        }

        Double ans = 0D;
        while(!queue.isEmpty()) {
            String formula = queue.remove();
            String[] splits = formula.split("\\+");
            for (String split : splits) {
                ans += Double.valueOf(split);
            }
        }

        System.out.println(BigDecimal.valueOf(ans).toPlainString());
    }
}
