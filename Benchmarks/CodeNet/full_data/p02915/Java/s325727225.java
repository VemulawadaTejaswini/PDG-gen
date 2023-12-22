import java.util.Scanner;
import java.io.*;

// public class Main {
//     public static void main(){
//         System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
//         Scanner sc = new Scanner(System.in);
//     }
// }

/**
 * Main
 */
public class Main {
    /*A Password*/
    public static void main(String[] args){
        //System.setOut(new PrintStream(new BufferedOutputStream(System.out)));
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(n*n*n);
    }
}