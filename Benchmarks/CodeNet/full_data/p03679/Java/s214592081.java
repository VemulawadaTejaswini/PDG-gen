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

        if(a >= b + c){
            System.out.println("delicious");
        }else{
            if(a * 2 >= b + c) {
                System.out.println("safe");
            }else{
                System.out.println("dangerous");
            }
        }




    }




} // MainClass
