import java.util.*;

public class Main {

    static long MOD = 1000000007;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt(),sy=sc.nextInt(),tx=sc.nextInt(),ty=sc.nextInt();

        for(int i=0;i<ty-sy;i++)System.out.print("U");
        for(int i=0;i<tx-sx;i++)System.out.print("R");
        for(int i=0;i<ty-sy;i++)System.out.print("D");
        for(int i=0;i<tx-sx;i++)System.out.print("L");
        System.out.print("L");
        for(int i=0;i<ty-sy+1;i++)System.out.print("U");
        for(int i=0;i<tx-sx+1;i++)System.out.print("R");
        System.out.print("DR");
        for(int i=0;i<ty-sy+1;i++)System.out.print("D");
        for(int i=0;i<tx-sx+1;i++)System.out.print("L");
        System.out.print("U");


    }
}
