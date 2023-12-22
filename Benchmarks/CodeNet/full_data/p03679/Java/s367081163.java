import javax.swing.*;
import java.util.*;



/**
 * Created by santa on 2016/10/16.
 */

public class Main {

    static final long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int c = scanner.nextInt();

        if(a >= c){
            System.out.println("delicious");
        }else{
            if(b + a >= c){
                System.out.println("safe");

            }else{
                System.out.println("dangerous");
            }
        }


    }




} // MainClass
