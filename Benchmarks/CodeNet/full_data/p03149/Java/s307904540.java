import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for(int i=0;i<4;i++) a[i]=sc.nextInt();
        Arrays.sort(a);
        String ans = a[0]==1&&a[1]==4&&a[2]==7&&a[3]==9?"YES":"NO";
        System.out.println(ans);
    }
}
