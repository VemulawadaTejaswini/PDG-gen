import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h =sc.nextInt();
        int w =sc.nextInt();
        char[][] c = new char[h][w];
        boolean[][] b = new boolean[h][w];
        boolean[] x = new boolean[h];
        for (int i = 0; i < h; i++) {
            String s = sc.next();
            x[i] = true;
            for (int j = 0; j < w; j++) {
                b[i][j] = true;
                c[i][j] = s.charAt(j);
            }
        }
        // ->
        for (int i = 0; i < h; i++) {
            boolean f = true;
            for (int j = 0; j < w; j++) {
                if(c[i][j] == '#'){
                    f = false;
                }
            }
            if(f){
                for (int j = 0; j < w; j++) {
                    b[i][j] = false;
                }
                x[i] = false;
            }
        }

        for (int j = 0; j < w; j++) {
            boolean f = true;
            for (int i = 0; i < h; i++) {
                if(c[i][j] == '#'){
                    f = false;
                }
            }
            if(f){
                for (int i = 0; i < h; i++) {
                    b[i][j] = false;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(b[i][j]){
                    System.out.print(c[i][j]);
                }
            }
            if(x[i]){
                io.br();
            }
        }

    }
}

class io{
    public static void br(){
        System.out.println("");
    }

    public static void YesNo(boolean f) {
        System.out.println(f?"Yes":"No");
    }
    public static void YESNO(boolean f) {
        System.out.println(f?"YES":"NO");
    }

}

class Algo{
    public static boolean isOdd(int n){
        return n % 2 == 1;
    }
    public static boolean isEven(int n){
        return n % 2 == 0;
    }


}

