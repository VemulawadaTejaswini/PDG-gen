import java.util.*;


/**
 * Created by santa on 2016/10/16.
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String s = scanner.next();

        int val = 0;
        int left = N;
        int right = 0;
        for (int i = N - 1; i >= 0; i--) {
            if(s.charAt(i) == ')'){
                val += 1;
            }else{
                if(val > 0){
                    val--;
                    left -= 2;
                }else{
                    right += 1;
                    left--;
                }
            }

        }
        for (int i = 0; i < left; i++) {
            System.out.print("(");
        }
        System.out.print(s);
        for (int i = 0; i < right; i++) {
            System.out.print(")");
        }
        System.out.println();

        

    }// mainMethod






} // MainClass
