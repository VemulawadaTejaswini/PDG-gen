import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int w = in.nextInt();
        int h = in.nextInt();
        int n = in.nextInt();
        int xl = 0;int xr=w; int yl =0;int yup = h;
        for(int i=0;i<n;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int a = in.nextInt();
            if (a == 1 && xl<=x){
                xl=Math.min(xr,x);
            }
            else if (a==2 && xr>=x){
                xr=Math.max(xl,x);
            }
            else if (a==3 && yl<=y){
                yl=Math.min(yup,y);
            }
            else if (a==4 && yup>=y){
                yup=Math.max(yl,y);
            }
        }
        int width = xr-xl;
        int hight = yup-yl;
        int area = width*hight;
        System.out.println(area);


    }
}