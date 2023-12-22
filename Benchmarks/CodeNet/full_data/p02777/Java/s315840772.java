import java.math.*;
import java.io.*;
class Main{
    public static void main(String[]args) throws IOException{
        InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader in=new BufferedReader(r);       
        int n = Integer.valueOf(in.readLine());
        int d = Integer.valueOf(in.readLine());
        int s = 0;
        for(int i = 1; i <= n ; i++){
            int c=0;String cs = Integer.toString(i);
            for(int j = 0; j < cs.length(); j++)
              if(cs.charAt(j)!='0')
                c++;
            if(c==d)
              s++;
        }
        System.out.println(s);
    }
}