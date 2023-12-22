
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        int miss = 0;

        for(int i = 1; i <= 3; i++){
            if(!(S.charAt(0) == S.charAt(i))){
                miss++;
            }


            if (miss >= 3) {
                System.out.println("No");
                return;
            }
            if(i == 3) {
                if (miss <= 3) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
    }
}
