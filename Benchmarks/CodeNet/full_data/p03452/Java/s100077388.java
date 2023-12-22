import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static class Fast {
        BufferedReader br;
        StringTokenizer st;

        public Fast() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class pair{
        long a,b;
        long dist=0L;
        pair(long a,long b,long dist){
            this.a=a;
            this.b=b;
            this.dist=dist;
        }
    }
    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        long n = in.nextInt();
        long m=in.nextInt();
        pair arr[]=new pair[(int) m];
        for (int i = 0; i <m; i++) {
            long l=in.nextInt(),r=in.nextInt();long dist=in.nextLong();
            if(l>r){
                arr[i]=new pair(r,l,dist);
            }else{
                arr[i]=new pair(l,r,dist);
            }
        }
        Arrays.sort(arr, new Comparator<pair>() {
            @Override
            public int compare(pair o1, pair o2) {
                int c= (int) (o1.a-o2.a);
                if(c!=0){
                    return c;
                }else{
                    return (int) (o1.b-o2.b);
                }
            }
        });
        long ans[]=new long[(int) (n+1)];
        Arrays.fill(ans,-1l);
        ans[1]=1l;
        for (int i = 0; i <arr.length; i++) {
            long l=arr[i].a,r=arr[i].b;
            long dist=arr[i].dist;
            long t=(long)ans[(int) l]+dist;
            if(ans[(int) r]!=-1 && ans[(int) r]!=t){
                System.out.println("No");
                return;
            }
            ans[(int) r]=t;

        }
        System.out.println("Yes");
    }
}




