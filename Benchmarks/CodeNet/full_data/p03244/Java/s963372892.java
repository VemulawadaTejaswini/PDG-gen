import java.io.*;
import java.util.*;

public class Main{
    static MyReader in = new MyReader();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args){
        final int n = in.i();
        int[] v = in.ii();
        int[] odd = new int[100001];
        int[] evn = new int[100001];
        int mo1 = 0, mo2 = 0, me1 = 0, me2 = 0, mov = 0, mev = 0;
        for(int i = 0; i < n/2; i++){
            int o = ++odd[v[2*i]];
            int e = ++evn[v[2*i+1]];
            if(mo1 < o){
                mo1 = o;
                mov = v[2*i];
            } else if(mo2 < o) mo2 = o;
            if(me1 < e){
                me1 = e;
                mev = v[2*i+1];
            }else if(me2 < e) me2 = e;
        }
       
        int ans = mov == mev ? n-Math.max(mo1+me2, mo2+me1) : n-mo1-me1;
        out.println(ans);
        
        out.flush();
    }

    static class MyReader extends BufferedReader{
        MyReader(){
            super(new InputStreamReader(System.in));
        }

        String s(){
            try{return readLine();}catch(IOException e){return "";}
        }

        String[] ss(){
            return s().split(" ");
        }

        int i(){
            return Integer.parseInt(s());
        }

        int[] ii(){
            String[] ss = ss();
            int[] ii = new int[ss.length];
            for(int j = 0; j < ss.length; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }

        long l(){
            return Long.parseLong(s());
        }

        long[] ll(){
            String[] ss = ss();
            long[] ll = new long[ss.length];
            for(int j = 0; j < ss.length; j++) ll[j] = Long.parseLong(ss[j]);
            return ll;
        }
    }
}
