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
        int m = sc.ni();

        int p[] = new int[m];
        String s[] = new String[m];
        for(int i = 0;i < m;i++)
        {
            p[i] = sc.ni();
            s[i] = sc.ns();
        }

        int z[] = new int[n];
        int ac = 0, wa = 0;
        for(int i = 0;i < m;i++)
        {
            if(s[i].equals("AC"))
            {
                if(z[p[i]-1] == 0)
                {
                    ac++;
                    z[p[i]-1] = 1;
                }
            }
            else
            {
                if(z[p[i]-1] == 0)
                {
                    wa++;
                }
            }
        }

        System.out.println(ac + " " + wa);
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
