import java.io.InputStream;
import java.util.Scanner;

/**
 * Created on 2017/10/29.
 */
public class Main{
    public static void main(String args[]){
        int R = 0;
        int x = 0;
        int G = 0;

        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        G = sc.nextInt();

        if(G == 0){
            x = -R;
        }else{
            x = R + G;
        }
        System.out.println(x);
    }

}
