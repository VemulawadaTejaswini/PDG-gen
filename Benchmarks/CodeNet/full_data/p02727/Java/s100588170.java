import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
    static int x,y,a,b,c;
    static Long aa[],bb[],cc[];
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        x=sc.nextInt();y=sc.nextInt();a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();
        aa=new Long[a];
        bb=new Long[b];cc=new Long[c];
        for (int i=0;i<a;i++)aa[i]=sc.nextLong();
        for (int i=0;i<b;i++)bb[i]=sc.nextLong();
        ArrayList<Long> arr=new ArrayList<>();
        for (int i=0;i<c;i++)arr.add(sc.nextLong());
        Arrays.sort(aa, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                long z=o2-o1;
                if (z>0)return 1;
                else return -1;
            }
        });Arrays.sort(bb, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                long z=o2-o1;
                if (z>0)return 1;
                else return -1;
            }
        });
        for (int i=0;i<Math.min(x,a);i++)arr.add(aa[i]);
        for (int i=0;i<Math.min(y,b);i++)arr.add(bb[i]);
        Collections.sort(arr,Collections.reverseOrder());
        long sum=0;
        for (int i=0;i<x+y;i++){
            sum+=arr.get(i);
        }
        System.out.println(sum);
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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
}