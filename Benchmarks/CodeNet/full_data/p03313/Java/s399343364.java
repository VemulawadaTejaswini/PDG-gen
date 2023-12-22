import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long[] a = new long[(1<<N)];
        for(int i=0;i<(1<<N);++i)a[i]=scan.nextLong();
        PrintWriter out = new PrintWriter(System.out);
        long bef=0;
        for(int K=1;K<(1<<N);++K){
            long max1=-1;
            long max2=-1;
            for(int j=K;j>=0;--j){
                j&=K;
                if(a[j]>max1){
                    max2=max1;
                    max1=a[j];
                }else if(a[j]>max2){
                    max2=a[j];
                }
            }
            bef=Math.max(bef, max1+max2);
            out.println(bef);
        }
        out.flush();out.close();
    }
}