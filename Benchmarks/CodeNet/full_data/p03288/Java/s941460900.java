import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int M;
    static int A;
    static long B;
    static long C;
//    static int[][] map;
    static int min = 9999999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        
        if(N < 1200){
            System.out.println("ABC");
        }else if(N < 2800){
            System.out.println("ARC");
        }else{
            System.out.println("AGC");
        }

    }




}

