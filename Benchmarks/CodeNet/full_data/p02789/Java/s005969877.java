import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        // スペース区切りの整数の入力
        int M = sc.nextInt();

        if(N > M){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}