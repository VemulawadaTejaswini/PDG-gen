
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if('7' == ch[i]){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }
}
