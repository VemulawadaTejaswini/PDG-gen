import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Throwable {
        MyScanner sc=new MyScanner();
        PrintWriter pw=new PrintWriter(System.out);

        int n=sc.nextInt();
        long [] a=new long [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(i>0)
                a[i]+=a[i-1];
        }
        long min=Long.MAX_VALUE;
        TreeSet<Long> set1=new TreeSet<>();
        TreeSet<Long> set2=new TreeSet<>();
        for(int i=0;i<n-2;i++)
            set1.add(a[i]);
        set2.add(a[n-1]-a[n-2]);
        set2.add(a[n-1]-a[n-3]);
        for(int i=n-3;i>0;i--){
            long s1=set1.last();
            long s2=set2.last();

//            System.err.println(set1+" "+set2);
            long x1=set1.higher(s1/2-1);
            long y1=s1-x1;

            long d1=Math.abs(y1-x1);

            if(set1.lower(x1)!=null){
                x1=set1.lower(x1);
                y1=s1-x1;
                if(Math.abs(y1-x1)>d1){
                    x1=set1.higher(x1);
                    y1=s1-x1;
                }
            }

            long x2=set2.higher(s2/2-1);
            long y2=s2-x2;

            long d2=Math.abs(y2-x2);

            if(set2.lower(x2)!=null){
                x2=set2.lower(x2);
                y2=s2-x2;
                if(Math.abs(y2-x2)>d2){
                    x2=set2.higher(x2);
                    y2=s2-x2;
                }
            }

            long [] arr={x1,y1,x2,y2};
            long mx=0;
            for(int j=0;j<4;j++)
                for(int k=j+1;k<4;k++)
                    mx=Math.max(mx,Math.abs(arr[j]-arr[k]));
            min=Math.min(min,mx);
            set1.remove(a[i]);
            set2.add(a[n-1]-a[i-1]);
        }



        pw.println(min);
        pw.flush();
        pw.close();
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