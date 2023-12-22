import java.io.*;
import java.lang.math;
public class CaracalMonster
  {
  public static void main(String [] args)
    {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter health of monster");
    int x= sc.nextInt();
    long count= 1;
    if(x== 1)
      
      System.out.println(1);
      
      
      else
        {
      int n=1;
      while(x>=1)
        {
        x=x/2;
        count= count + math.pow(2,n);
        n++;
        }
        
    System.out.print(count);
        }
    }
  }


        
        
        
        
        
    