import java.util.*;
import java.io.*;
import java.lang.*;
// ArrayList<Integer>[] arr=new ArrayList[n];
public class Main{    
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=s.nextInt();
        Set<Integer>ss=new HashSet<>();
         for(int i=1;i<=9;i++){
            for(int j=i;j<=9;j++){
                ss.add(i*j);
            }
         }
         if(ss.contains(n)){
            System.out.println("Yes");
         }
         else{System.out.println("No");}
       // System.out.println(sb);
    }
}