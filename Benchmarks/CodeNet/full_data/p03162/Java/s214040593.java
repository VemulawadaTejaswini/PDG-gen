import java.util.*;
import java.io.*;
class Main{

     public static void main(String []args) throws Exception{
       // System.out.println("Hello World");
        BufferedReader br =new BufferedReader (new InputStreamReader(System.in));
        String s;
        int N;
        s=br.readLine();
        N=Integer.parseInt(s);
        int pos=-1;
        int a=0,b=0,c=0;
        String ss[];
        long sum=0l;
        s=br.readLine();
        ss=s.split(" ");
            a=Integer.parseInt(ss[0]);
            b=Integer.parseInt(ss[1]);
            c=Integer.parseInt(ss[2]);
            int max=Math.max(a,b);
        if(max==a)
            {
                pos=0;
            }
            else{
                pos=1;
            }
            max=Math.max(max,c);
            if(max==c)
            {
                pos=2;
            }
            sum+=max*1l;
         //System.out.println("initial"+sum);
        for(int i=1;i<N;i++)
        {
            s=br.readLine();
            ss=s.split(" ");
            a=Integer.parseInt(ss[0]);
            b=Integer.parseInt(ss[1]);
            c=Integer.parseInt(ss[2]);
            max=Math.max(a,b);
            max=Math.max(max,c);
            
           
            
            if((max==a) && (pos==0))
            {
                max=Math.max(b,c);
                if(max==b)
                {
                    pos=1;
                }
                else{
                    pos=2;
                }
            }
            
            if((max==b) &&( pos==1))
            {
                max=Math.max(a,c);
                if(max==a)
                {
                    pos=0;
                }
                else{
                    pos=2;
                }
            }
            
            
            
            if((max==c) &&( pos==2))
            {
                max=Math.max(a,b);
                if(max==a)
                {
                    pos=0;
                }
                else{
                    pos=1;
                }
            }
           // System.out.println("max "+max +" pos "+pos);
           sum+=max*1l;
           
        }
        System.out.println(sum);
        
     }
}