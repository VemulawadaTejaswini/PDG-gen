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
        char c = sc.ns().charAt(0);
        System.out.println((char)(c+1));

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
