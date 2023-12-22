import java.io.*;
import  java.util.*;

import static java.lang.System.in;

class Main{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int[][] res = new int[3][];
        int a = sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        res[0] = new int[]{a,b,3*c-b-a};
        res[1] = new int[]{4*c-2*a-b,c,2*a+b-2*c};
        res[2] = new int[]{a+b-c,2*c-b,2*c-a};
        for(int i=0;i<3;i++){
            String ans="";
            for(int j=0;j<3;j++) ans = ans+Integer.toString(res[i][j])+" ";
            System.out.println(ans);
        }
    }
}
