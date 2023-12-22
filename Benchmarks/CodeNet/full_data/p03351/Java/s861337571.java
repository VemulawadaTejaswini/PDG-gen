import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        if (Math.abs(a-b) <= d){   //aとcが直接会話できるか
            System.out.println("Yes");
        } else if (Math.abs(a-b) <= d && Math.abs(c-b) <= d){ //aとcが間接的に会話できるか
            System.out.println("Yes");
        } else {
             System.out.println("No");
        }
        
    }
}