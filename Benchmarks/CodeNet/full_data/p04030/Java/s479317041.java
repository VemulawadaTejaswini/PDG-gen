import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[] array = sc.next().toCharArray();
        for (char tmp : array) {
            if (tmp == '0') {
                sb.append('0');
            } else if (tmp == '1') {
                sb.append('1');
            } else if (sb.length() > 0 && tmp == 'B'){
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        System.out.println(sb.toString());
    }
}