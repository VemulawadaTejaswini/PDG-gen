import java.util.*;


/**
 * Created by santa on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans = a * 100 + b * 10 + c;
        if(ans % 4 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }// mainMethod




} // MainClass
