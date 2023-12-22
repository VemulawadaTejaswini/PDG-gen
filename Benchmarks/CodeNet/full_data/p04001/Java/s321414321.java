import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final int PLAYER_SELF = 1;
    public static final int PLAYER_ENEMY = 2;

    public static int[][] rep;
    public static int[] num;
    public static int[] minNum;
    public static int[] repindexes;
    public static int repCurrent = 0;

    public static void main(String[] args) {
        new Main().run();
    }

    public static boolean checkDigit(int num, int digit){
        int result = (num & (int)Math.pow(2, digit));
        return (result > 0);
    }

    public static long subtotal(String base, boolean[] digi){
        long total = 0;
        int from = 0;
        for (int i=0; i<digi.length; i++){
            if (!digi[i]) continue;;
            total += Long.parseLong(base.substring(from, i+1));
//            System.out.print(base.substring(from, i+1)+" + ");
            from = i+1;
        }
        total += Long.parseLong(base.substring(from, base.length()));
//        System.out.print(base.substring(from, base.length())+" = " + total);
//        System.out.println();
        return total;
    }


    public void run(){
        BufferedReader br = null;
        try {
            Scanner s = new Scanner(System.in);
//            Scanner s = new Scanner(new FileInputStream("./testdat"));

            String val = s.next();

            int trycount = (int)Math.pow(2, val.length()-1);
            long total = 0;
            for (int i=0; i<trycount; i++){
                boolean[] digit = new boolean[val.length()-1];
                for (int t =0; t<val.length()-1; t++){
                    boolean res = checkDigit(i, t);
                    digit[t] = res;
                }
                total += subtotal(val, digit);
            }
            System.out.println(total);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
