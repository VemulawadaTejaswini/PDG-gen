import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        String str = sc.next();
        int num2 = Integer.parseInt(sc.next());
        String targetValue = str.substring(num2 -1,num2);
        System.out.println(targetValue);
        String tmpValue = "";
        for (int i = 0; i < str.length(); i++) {
            tmpValue = String.valueOf(str.charAt(i));
            if (!targetValue.equals(tmpValue)) {
                str = str.replace(tmpValue,"*");
            }
        }
        System.out.println(str);
    }
}