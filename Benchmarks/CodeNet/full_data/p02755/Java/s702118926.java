
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] arg){
        Main m = new Main();
        m.run();
    }

    void run(){
        int a = sc.nextInt();
        int b = sc.nextInt();

        int amin = ((a) * 100 + 7)/ 8;
        int amax = ((a+1) * 100 )/ 8;

        int bmin = ((b) * 100 + 9)/ 10;
        int bmax = ((b+1) * 100 )/ 10;

        if (bmin <= amin && amin < bmax){
            System.out.println(amin);
        }else if (amin <= bmin && bmin < amax){
            System.out.println(bmin);
        }else{
            System.out.println(-1);
        }
    }
}
