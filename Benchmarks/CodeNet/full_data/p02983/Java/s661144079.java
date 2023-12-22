import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int r=sc.nextInt();
        long max=Long.MAX_VALUE;
        for (int i=l;i<r;i++){
            long ii=i;
            for (int j=i+1;j<=r;j++){
                long jj=j;
                long x=(ii*jj)%2019;
                if (x<max){
                    max=x;
                }
                if (max==0)break;
            }
            if (max==0)break;
        }
        System.out.println(max);

    }

}

