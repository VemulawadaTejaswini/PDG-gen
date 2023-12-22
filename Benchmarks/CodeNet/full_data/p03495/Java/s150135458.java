import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Fast in = new Fast();
        int n=in.nextInt();
        int k=in.nextInt();
        int arr[]=new int[n];
        int dup[]=new int[200000+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
            dup[arr[i]]++;
        }
        Arrays.sort(dup);
        long ans=0;
        for(int i=dup.length-1;i>=0;i--){
            if(k==0 && dup[i]!=0){
                ans=ans+dup[i];
            }
            if(dup[i]!=0 && k!=0){
                k--;
            }
        }
        System.out.println(ans);
    }
}


class Fast {
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

