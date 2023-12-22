import java.util.*;
public class Main {
public static void main(String args[])
{
  Scanner sp=new Scanner(System.in);
    int n=sp.nextInt();
    int sc=0;
    int l=(int) (Math.log10(n) + 1);
 
    if(l%2==0)
    
     {
     for(int i=n;i>0;i--)
     {
        int sn=(int) (Math.log10(i) + 1);
        if(!(sn%2==0))
         {
          sc++;  
         }
     }
      System.out.println(sc);
    }
    else
    {
     for(int i=n;i>0;i--)
     {
        int sn=(int) (Math.log10(i) + 1);
        if(!(sn%2==0))
         {
          sc++;  
         }
     }
      System.out.println(sc);
    }
}
}
	
	
	
