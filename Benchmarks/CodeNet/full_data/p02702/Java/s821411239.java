import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    static class FastReader
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
                    catch (IOException e)
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

            double nextDouble()
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
    public static boolean isInteger(String str){
        try{
            Integer.parseInt(str);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public static void main(String[] args) {
        FastReader ob = new FastReader();
        String s = ob.next();
        int n = s.length();
        String check="";
        s=s.trim();
        int count=0;
        for (int i = 0; i <n-1 ; i++) {
            check+=s.charAt(i);
            for (int j = i+1; j <n ; j++) {
                check+=s.charAt(j);
               // System.out.println(check);
                if(isInteger(check) ){
                    if((Integer.parseInt(check.trim()))%2019==0){
                        count++;

                    }

                }
            }
            check="";
        }
        System.out.println(count);


    }
}