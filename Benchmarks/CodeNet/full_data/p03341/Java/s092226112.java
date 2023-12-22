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

    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n=in.nextInt();
        char arr[]=in.nextLine().toCharArray();
        int w[]=new int [n];
        int e[]= new int[n];
        if(arr[0]=='W'){
            w[0]=1;
        }else{
            e[0]=1;
        }
        for (int i = 1; i < n; i++) {
            if(arr[i]=='E'){
                e[i]=e[i-1]+1;
                w[i]=w[i-1];
            }else if(arr[i]=='W'){
                w[i]=w[i-1]+1;
                e[i]=e[i-1];
            }
        }
        int min=1000000000;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            if(i==0){
                if(arr[i]=='W'){
                    sum=w[n-1]-w[i];
                }else{
                    sum=w[n-1]-w[i];
                }
            }else{
                if(arr[i]=='W'){
                    sum=e[i-1]+w[n-1]-w[i];
                }else{
                    sum=e[i-1]+w[n-1]-w[i];
                }
            }
            int ans=n-sum-1;
            if(ans<min){
                min=ans;
            }
        }
        System.out.println(min);
    }
}




