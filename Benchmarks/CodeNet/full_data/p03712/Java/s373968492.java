import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(in);
    int H = Integer.parseInt(sc.next());
    int W = Integer.parseInt(sc.next());
char[][] a=new char[H][W];
    for (int i = 0; i < H; i++) {
        String p=sc.next();
        for (int j = 0; j < W; j++) {
            a[i][j]=p.charAt(j);
        }
    }
    for (int i = 0; i < W+2; i++) {
        out.print("#");
    }out.println();
    for (int i = 0; i <H; i++) {
        for (int j = 0; j <=W; j++) {
            if(j==0)out.print("#");
            if(j!=W)out.print(a[i][j]);
            if(j==W)out.print("#");
        }
        out.println();
    }
    for (int i = 0; i < W+2; i++) {
        out.print("#");
    }out.println();
}
}