import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        String str = sc.next();
        char c[] = str.toCharArray();
        int intc = (int)c[0] + 1;
        char result = (char)intc;
        // 出力
        System.out.println(result);
    }
}