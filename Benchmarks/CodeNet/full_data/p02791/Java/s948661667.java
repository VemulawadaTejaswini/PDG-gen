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
        int a[] = new int[n];

        for(int i = 0;i < n;i++)
        {
            a[i] = sc.ni();
        }

        int min = a[0];
        int ans = 1;
        for(int i = 1;i < n;i++)
        {
            if(a[i] <= min)
                ans++;
            min = Math.min(min, a[i]);
        }
        System.out.println(ans);

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
