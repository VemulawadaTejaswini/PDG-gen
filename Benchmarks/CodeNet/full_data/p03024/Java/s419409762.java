import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        String s = sc.next();
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'o') count++;
        }

        if(15 - s.length() + count >= 8){
            System.out.println("YES");
        }else{
            System.out.println("NO");    
        }

    }

}