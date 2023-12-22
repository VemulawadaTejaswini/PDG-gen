import java.util.Scanner;
/**
 * Created by maxmo on 19.06.2017.
 */
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println((a + b >= 10)? "error" : a + b);
    }
}