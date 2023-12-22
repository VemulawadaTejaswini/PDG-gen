import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] rec = new int[4];
        for(int i=0;i<3;i++){
            int a=sc.nextInt()-1,b=sc.nextInt()-1;
            rec[a]++;rec[b]++;
        }
        Arrays.sort(rec);
        String ans = rec[0]==1&&rec[1]==1&&rec[2]==2&&rec[3]==2?"YES":"NO";
        System.out.println(ans);
    }
}
