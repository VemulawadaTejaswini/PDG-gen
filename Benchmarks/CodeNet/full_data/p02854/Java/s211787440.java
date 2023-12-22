import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] ary=new long[n];
        PriorityQueue<Long> pq=new PriorityQueue<>();
        long gt=0;
        for(int i=0;i<n;i++){
            ary[i]=sc.nextLong();
            gt+=ary[i];
        }
        sc.close();
        long a=0;
        for(int i=0;i<n;i++){
            a+=ary[i];
            pq.add((long)Math.abs(gt-2*a));
        }
        System.out.println(pq.remove());
    }
}