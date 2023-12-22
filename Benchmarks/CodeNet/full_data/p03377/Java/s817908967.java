   import java.util.*;
    public class Main {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            // 整数の入力
            int a = sc.nextInt();
            // スペース区切りの整数の入力
            int b = sc.nextInt();
            int c = sc.nextInt();
            // 文字列の入力
            int sum=a+b;

            if(a>=c){
                if(sum>=c){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
    }
