import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int[] sxx = {sx,sx+1,sx-1,sx};
        int[] syy = {sy+1,sy,sy,sy-1};
        int[] txx = {tx-1,tx,tx,tx+1};
        int[] tyy = {ty,ty-1,ty+1,ty};
        String d = "";
        for(int i = 0;i < 4;i++){
            if(i == 0){
                d += "U";
                //System.out.println("syy = "+ syy[i]);
                //System.out.println("tyy = "+ tyy[i]);
                //System.out.println("sxx = "+ sxx[i]);
                //System.out.println("txx = "+ txx[i]);
                for(int j = syy[i];j < tyy[i];j++){
                    d += "U";
                }
                for(int j = sxx[i];j < txx[i];j++){
                    d += "R";
                }
                d += "R";
            }
            if(i == 1){
                d += "D";
                for(int j = syy[i];j < tyy[i];j++){
                    d += "D";
                }
                for(int j = sxx[i];j < txx[i];j++){
                    d += "L";
                }
                d += "L";
            }
            if(i == 2){
                d += "L";
                for(int j = syy[i];j < tyy[i];j++){
                    d += "U";
                }
                for(int j = sxx[i];j < txx[i];j++){
                    d += "R";
                }
                d += "D";
            }
            if(i == 3){
                d += "R";
                for(int j = syy[i];j < tyy[i];j++){
                    d += "D";
                }
                for(int j = sxx[i];j < txx[i];j++){
                    d += "L";
                }
                d += "U";
            }
        }
        System.out.println(d);
    }
}
