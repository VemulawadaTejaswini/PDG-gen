import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        int x = sc.nextInt();
        
        if((a <= x) && (x <= (a+b))){
            System.out.println("yes");
        }else {
            System.out.println("NO");
        }
    }
}