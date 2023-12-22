import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String ans = "";

        if ("Sunny".equals(a)){
            ans = "Cloudy";
        }else if("Cloudy".equals(a)){
            ans = "Rainy";
        }else{
            ans = "Sunny";
        }
        // 出力
        System.out.println(ans);

    }
}