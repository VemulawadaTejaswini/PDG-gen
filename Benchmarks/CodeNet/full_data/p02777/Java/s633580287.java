import java.util.*;
public class Main {
    public static void main(final String[] args){
        final Scanner sc = new Scanner(System.in);
        
        final String color1 = sc.next();
        final String color2 = sc.next();

        // スペース区切りの整数の入力
        int color1_n = sc.nextInt();
        int color2_n = sc.nextInt();
        // 文字列の入力
        final String target = sc.next();

        if(target.equals(color1)){
            color1_n--;
        }else if(target.equals(color2)){
            color2_n--;
        }
        // 出力
        System.out.println(color1_n + " " + color2_n);
        sc.close();
    }
}