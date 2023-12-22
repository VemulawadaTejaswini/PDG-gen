import java.io.*;
import java.util.*;
public class Main{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String args[]){
        ans();
    }
    public static void ans(){
        int n=scn.nextInt();
        long count=0;
        // if(n>=1000000)
        // System.out.print(266666333332);
        
      for(int i=1;i<=n;i++){
      
          if(i%3!=0 && i%5!=0){
         count+=i;       
    }
}
// if(n<1000000)
System.out.print(count);
}
}