import java.util.*;
public class RGBCards {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(((a*100+b*10+c) % 4) == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
