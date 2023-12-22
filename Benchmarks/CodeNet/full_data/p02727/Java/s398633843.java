
import java.io.*;
import java.util.*;

public class Main {
        
            
    static StringBuilder out=new StringBuilder();
    static FastReader in=new FastReader();

    public static void reverse(int []a){
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];a[i]=a[j];a[j]=temp;
            i++;j--;
        }
    }
    public static void main(String args[]){
        int x=in.nextInt(),y=in.nextInt(),a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
        int p[]=getIntArray(a);
        int q[]=getIntArray(b);
        int r[]=getIntArray(c);
        Arrays.sort(p);reverse(p);
        Arrays.sort(q);reverse(q);
        Arrays.sort(r);reverse(r);
        int []sel=new int[x+y+c];
        int k=0;
        for(int i=0;i<x;i++){
            sel[k++]=p[i];
        }
        for(int i=0;i<y;i++){
            sel[k++]=q[i];
        }
        for(int i=0;i<c;i++){
            sel[k++]=r[i];
        }
        Arrays.sort(sel);reverse(sel);
        long ans=0;
        for(int i=0;i<x+y;i++){
            ans+=sel[i];
        }
        System.out.println(ans);
    }
    public static int[] getIntArray(int n){
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        return arr;
    }   


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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