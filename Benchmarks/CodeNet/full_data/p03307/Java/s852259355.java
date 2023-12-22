//CREATED BY : AMBIKESH JHA
//NEPAL
//Never Give Up Trying...


/*starting import statements*/
import java.io.*;
import java.util.*;
import java.math.*;
/*ending import statements*/

//Code Begins Here
public class Temp{
    static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
    static int tc;
    static String[] s;
    /*define methods here*/
     public static int[] parseArray(String[] s){
       int[] array=new int[s.length];
       for(int i=0;i<array.length;i++){
         array[i]=Integer.parseInt(s[i]);
       }
       return array;
     }
    /*end methods here*/

        public static void main(String[] args)throws IOException{
        //long start=System.nanoTime();
        tc=1;
        //tc=Integer.parseInt(br.readLine());
        t:
        while(tc-->0){
          long answer=0;
          int n=Integer.parseInt(br.readLine());
          if((n&1)==0){
            answer=n;
           out.write(answer+"");}
          else{
            answer=(n<<1);
           out.write(answer+"");}
        //out.write("\nTime elapsed = "+(System.nanoTime()-start)+ " nanoSec.\n");
        out.close();
      }
    }
}
/*define class here*/

/*end class here*/
