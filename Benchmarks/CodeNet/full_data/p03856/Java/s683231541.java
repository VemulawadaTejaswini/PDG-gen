
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String []PARTS = {"dream","dreamer","erase","eraser"};
        boolean flag = true;
        boolean able = true;
        while(flag) {
            flag = false;
            for (int i = 0; i < PARTS.length; i++) {
                if (input.endsWith(PARTS[i])) {
                    input = input.substring(0, input.length() - PARTS[i].length());
                    input = "";
                    flag= true;
                }
            }
            if (input.length()==0) able =true;
            else able = false;
        }
        if(able){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        sc.close();

    }

}
