import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble(), r2=sc.nextDouble();
        double ans = r1*r2/(r1+r2);
        System.out.println(ans);
    }
}
