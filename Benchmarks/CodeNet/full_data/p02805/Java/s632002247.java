// Java program For handling Input/Output 
import java.io.*; 
import java.util.*;
import java.math.*;
//import java.awt.*;

public class Main 
{ 
    FastReader sc;
    //actual logic
    void solve(){
        int n = sc.ni();
        int x[] = new int[n];
        int y[] = new int[n];

        for(int i = 0;i < n;i++)
        {
            x[i] = sc.ni();
            y[i] = sc.ni();
        }
        double ans = dist(x[0], y[0], x[1], y[1]);
        for(int i = 2;i < n;i++)
        {
            for(int j = 0;j < i;j++)
            {
                ans = Math.max(ans, dist(x[i], y[i], x[j], y[j]));
            }
        }
        System.out.println(ans/2);
    }

    double dist(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt(Math.pow((y1-y2), 2)+Math.pow((x1-x2), 2));
    }
    
    //constructor
    Main()
    {
        try{  
            sc = new FastReader();
        }catch(Exception e){
            System.out.println(e);
        }
    }


    //main metohd
    public static void main(String[] args)
    { 
       new Main().solve();
   }
    //Utility methods

   static class FastReader{
    BufferedReader br;
    StringTokenizer st;
    FastReader(){
        br = new BufferedReader(new InputStreamReader(System.in));
        try{
            st = new StringTokenizer(br.readLine());
        }catch(Exception e){
            System.out.println(e);
        }
    }

    FastReader(String s){
        try{
            br = new BufferedReader(new FileReader(s));
            st = new StringTokenizer(br.readLine());
        }catch(Exception e){
            System.out.println(e);
        }
    }

    String ns(){
        if(!st.hasMoreTokens())
        {
            try{
                st = new StringTokenizer(br.readLine());
            }catch(Exception e){
                System.out.println(e);
            }    
        }
        return st.nextToken();

    }

    int ni(){
        return Integer.parseInt(ns());
    }

    long nl(){
        return Long.parseLong(ns());
    }

    double nd(){
        return Double.parseDouble(ns());
    }
}
}
