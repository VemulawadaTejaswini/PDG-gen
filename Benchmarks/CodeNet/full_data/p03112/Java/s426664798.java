/*Author: Satyajeet Singh, Delhi Technological University*/
import java.io.*;
import java.util.*;
import java.text.*; 
import java.lang.*;

public class Main {
/*********************************************Constants******************************************/
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));        
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

/****************************************Solutions Begins*****************************************/
    public static void main (String[] args) throws Exception {
        String st[]=br.readLine().split(" ");
        long A=Long.parseLong(st[0]);
        long B=Long.parseLong(st[1]);
        long q=Long.parseLong(st[2]);
        TreeSet<Long> tem=new TreeSet<>();
        TreeSet<Long> shr=new TreeSet<>();
        for(long i=0;i<A;i++){
            st=br.readLine().split(" ");
            long a=Long.parseLong(st[0]);
            shr.add(a);
        }
        for(long i=0;i<B;i++){
            st=br.readLine().split(" ");
            long a=Long.parseLong(st[0]);
            tem.add(a);
        }
       // System.out.println("ans)");
        while(q-->0){
            ArrayList<Long> list=new ArrayList<>();
            st=br.readLine().split(" ");
            Long x=Long.parseLong(st[0]);
            Long vv=shr.higher(x-1);
            Long oo=tem.higher(x-1);
            Long xx=0l;
            if(vv!=null&&oo!=null){
                xx=Math.max(oo,vv)-x;
                if(xx!=null){
                    list.add(xx);
                }        
            } 
             
            vv=tem.floor(x);
            oo=shr.floor(x);
            if(vv!=null&&oo!=null){
                xx=x-Math.min(oo,vv);
                if(xx!=null){
                    list.add(xx);
                }
            }
            
            Long tr=0l;
            Long yy=shr.floor(x);
            if(yy!=null){
                tr=x-yy;
                Long aa=tem.higher(yy-1);
                if(aa!=null){
                    list.add(tr+aa-yy);
                }
            }
            
            yy=tem.floor(x);
            tr=0l;
            if(yy!=null){
                tr=x-yy;
                Long aa=shr.higher(yy-1);
                if(aa!=null){
                    list.add(tr+aa-yy);
                }
            } 


            tr=0l;
            yy=shr.higher(x-1);
            if(yy!=null){
                tr=yy-x;
                Long aa=tem.lower(yy);
                if(aa!=null){
                    list.add(tr-aa+yy);
                }
            }
            tr=0l;
            yy=tem.higher(x-1);
            if(yy!=null){
                tr=yy-x;
                Long aa=shr.lower(yy);
                if(aa!=null){
                    list.add(tr-aa+yy);
                }
            }

            
            Collections.sort(list);
            out.println(list.get(0));          
        }
 
/****************************************Solutions Ends**************************************************/
        out.flush();
        out.close();
    }
}