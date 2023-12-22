import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.*;


public class Main {
static String a;
static String b;

    public static void main(String[] args) {
        FastReader in = new FastReader();
        String s1 = in.next();
        String s2 = in.next();
        a = s1;
        b = s2;
        String rev_ans = go(s1.length()-1,s2.length()-1,"");
        String ans = "";
        for(int i=rev_ans.length()-1;i>=0;i--){
            ans+=rev_ans.charAt(i);
        }
        System.out.println(ans);


    }

    static String go(int i,int j,String ans){
        if(i==-1 || j==-1){
            return ans;
        }
        if(a.charAt(i)==b.charAt(j)){
            ans+=a.charAt(i);
            return go(i-1,j-1,ans);
        }
        String temp1 =  go(i-1,j,ans);
        String temp2 =  go(i,j-1,ans);


        if(temp1.length()>temp2.length()){
            return temp1;
        }else{
            return temp2;
        }
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

