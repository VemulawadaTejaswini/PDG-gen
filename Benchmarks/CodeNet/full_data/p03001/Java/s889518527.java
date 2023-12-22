import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        double w=sc.nextInt();
        double h=sc.nextInt();
        double x=sc.nextInt();
        double y=sc.nextInt();
        double a=w*h/2d;
        int one=0;
        if (w==2*x && h==2*y)one=1;
        System.out.println(a+" "+one);
    }


}

