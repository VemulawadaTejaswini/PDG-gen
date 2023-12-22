// Java program For handling Input/Output 
import java.io.*; 
import java.util.*;
import java.math.*;
//import java.awt.*;

public class Main 
{ 
    FastReader sc;
    //actual logic
    void solve() throws IOException{
        int n = sc.ni();
        int m = sc.ni();

        if(n < m)
        {
            for(int i = 0;i < m;i++)
                System.out.print(n);
        }
        else
        {
            for(int i = 0;i < n;i++)
                System.out.print(m);
        }

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
    public static void main(String[] args) throws IOException
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
