////////////////////////////////////////////////////
//                                                //
//  For her who keeps the fire kindling in me...  //
//                                                //
////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
// import java.util.Scanner;
// import java.util.Arrays;
// import java.util.ArrayList;
// import java.util.Collections; 
// import java.util.StringTokenizer;
import java.util.*;
import java.lang.Math;
import java.awt.Point;
import java.awt.geom.*;

class Main{

    static long gcd(long a, long b){
        if(a==0)    
            return b;
        return gcd(b%a, a);
    }

    void solve(){
        try{
            FastReader s = new FastReader();
            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
            int  q, i, j, x, n, dis1, dis2, prod, freq;
            long a, b, hcf;
            boolean flag;

            String str;
            str = s.next();
            n  = str.length();
            char arr[];
            arr = str.toCharArray();

            flag = true;
            x=1;
            for(i=1; i<n; i++){
                if(flag && (arr[i]-arr[i-1])==0){
                    i++;
                    flag = false;
                }
                else
                    flag = true;
                x++;

                //w.write(i+" ");
                if(flag==false && i==(n) && arr[i-1]==arr[i-2])
                    x--;
            }
            w.write(x+"\n");
            w.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]){
        (new Main()).solve();
    }
}
                
                
//========================================### FAST IO ###=========================================//
class FastReader 
{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader() 
    { 
        br = new BufferedReader(new
                    InputStreamReader(System.in)); 
    } 

    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
    } 

    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 

    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 

    Double nextDouble() 
    { 
        return Double.parseDouble(next());
    } 

    String nextLine() 
    { 
        String str = ""; 
        try
        { 
            str = br.readLine(); 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str;
    } 
}
    //====================================================================================================//