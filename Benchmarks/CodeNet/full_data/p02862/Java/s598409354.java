import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
/* Name of the class has to be "Main" only if the class is public. */


/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
      int x=s.nextInt();
      int y=s.nextInt();
      
      if((2*x-y)%3)!=0||(2*y-x)%3!=0)
        System.out.println(0);
      else
      {
        int n=(2*x-y)/3;
        int m =(2*y-x)/3;

long ans=1,mod=1000000007;        
for(int i=1;i<=(n+m);i++){
ans=(ans*(i%mod))%mod;
}
System.out.println(ans);
}
}
        