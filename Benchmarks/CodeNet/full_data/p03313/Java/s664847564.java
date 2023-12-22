import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Throwable {
        MyScanner sc=new MyScanner();
        PrintWriter pw=new PrintWriter(System.out);

        int n=sc.nextInt();
        int m=(1<<n);
        int [] a=new int [m];
        pair [] max1=new pair [m];
        pair [] max2=new pair [m];
        for(int i=0;i<m;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<m;i++){
            pair p=new pair(i,a[i]);
            if(max1[i]==null || max1[i].val<p.val){
                max2[i]=max1[i];
                max1[i]=p;
            }else
            if(max2[i]==null || max2[i].val<p.val)
                max2[i]=p;

            for(int j=0;j<n;j++)
                if((i & (1<<j))==0){
                    int k=i | (1<<j);

                    if(max1[k]==null){
                        max1[k]=max1[i];
                        max2[k]=max2[i];
                    }else{
                        if(max1[k].val<max1[i].val){
                            max2[k]=max1[k];
                            max1[k]=max1[i];
                            if(max2[k].val<max2[i].val){
                                max2[k]=max2[i];
                            }
                        }else
                            if(max2[k].val<max1[i].val)
                                max2[k]=max1[i];
                    }
                }
                if(i>0)
                    pw.println(max1[i].val+max2[i].val);
        }

        pw.flush();
        pw.close();
    }

    static class pair{
        int idx,val;
        pair(int i,int v){
            idx=i;
            val=v;
        }
    }

    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {while (st == null || !st.hasMoreElements()) {
            try {st = new StringTokenizer(br.readLine());}
            catch (IOException e) {e.printStackTrace();}}
            return st.nextToken();}
        int nextInt() {return Integer.parseInt(next());}
        long nextLong() {return Long.parseLong(next());}
        double nextDouble() {return Double.parseDouble(next());}
        String nextLine(){String str = "";
            try {str = br.readLine();}
            catch (IOException e) {e.printStackTrace();}
            return str;}
    }
}