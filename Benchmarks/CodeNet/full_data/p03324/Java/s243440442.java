import java.util.*;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static int A;
    static long B;
    static long C;
    static int[] map = new int[1000000];
    static int min = 9994999;




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int N = scanner.nextInt();

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A == 0){
            System.out.println(B * 1);
        }else if(A == 1){
            System.out.println(B * 100);
        }else{
            System.out.println(B * 10000);
        }

    }

}

