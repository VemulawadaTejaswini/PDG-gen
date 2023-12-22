import java.util.*;
public class Main
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      if(m == 0)
        System.out.println(0+" "+0);
      else
      {
          int correct=0;
          int penalty=0;
          int a[]=new int[n];
          int b[]=new int[n];
          int c[]=new int[n];
          
          for(int i=0;i<m;i++)
            {
                int x = sc.nextInt();
                b[x-1]=1;
                String xx = sc.next();
                if(a[x-1] == 0)
                {
                    if(xx.equals("WA"))
                    {
                         penalty++;
                         c[x-1]++;
                    }
                       
                    else
                    {
                        correct++;
                        a[x-1]=1;
                        
                    }
                        
                }
              
                
            }
            for(int i=0;i<n;i++)
            {
                if(b[i] == 1)
                {
                    if(a[i] == 0)
                         penalty = penalty-c[i];
                }
                   
            }
            System.out.println(correct+" "+penalty);
           
      }
     
     
        
      
  }
}