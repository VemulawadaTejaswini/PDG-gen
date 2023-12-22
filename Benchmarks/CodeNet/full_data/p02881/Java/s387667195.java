import java.util.*;
import java.io.*;
import java.lang.*;
// ArrayList<Integer>[] arr=new ArrayList[n];
public class Main{    
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         long n=s.nextLong();
        //Set<Integer>ss=new HashSet<>();
         long res=Long.MAX_VALUE;
         for(long i=1;i<=1000000;i++){
            if(n%i==0){
                res=(long)Math.min(res,i-1+n/i -1);
            }
         }
         /*if(res==(long)1e9+7){
            System.out.println(n-1);
         }
         else{
            System.out.println(res);
         }*/
        System.out.println(res);
    }
}