import java.util.*;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        int xlen=Math.abs(x1-x2);
        int ylen=Math.abs(y1-y2);
        if(x1<=x2&&y1<y2){
            System.out.println(""+(x2-ylen)+" "+(y2+xlen)+" "+((int)x1-ylen)+" "+((int)y1+xlen));
        }else if(x1<=x2&&y2<=y1){
            System.out.println(""+((int)x2+ylen)+" "+((int)y2+xlen)+" "+(int)(x1+ylen)+" "+((int)y1+xlen));
        }else if(x2<=x1&&y1<y2){
            System.out.println(""+((int)x2-ylen)+" "+((int)y2-xlen)+" "+((int)x1-ylen)+" "+((int)y1-xlen));
        }else if(x2<x1&&y2<=y1){
            System.out.println(""+(x2-ylen)+" "+(y2-xlen)+" "+(x1-ylen)+" "+(y1-xlen));
        }
    }
}