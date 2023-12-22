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

public class Main{

    // static class Pair{
    //     int x;
    //     int y;
    // }

    public static void main(String args[]){
        try{
            FastReader s = new FastReader();
            BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
            int i, j, k, x, y, t,  count, key, size, Pairer, minglob, minloc, beg, end, begl, endr, ld, up, down, maxele, minele;
            long ans, sqrt, q, r, sum, maxup, maxdown, n, m, X, Y, Q, MOD;//, sum2;
            boolean flag, flag2;

            double avg;

            // t = s.nextInt();

            // for(; t>0; t--){

                X = s.nextLong();
                //Y = s.nextLong();


                
                if( X%2 == 0){
                    w.write(((X/2))+"\n");
    
                }else
                    w.write(((X/2) + 1)+"\n");

            // }
            w.close();
        }catch(Exception e){
            e.printStackTrace();
        }
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