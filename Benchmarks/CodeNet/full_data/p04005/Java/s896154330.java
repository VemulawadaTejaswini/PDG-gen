import java.util.*;

public class Main{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a[] = new long[3];
long t;
    for(int i=0;i<3;i++)
    {
          a[i] = sc.nextLong();
          if(a[i]%2==0)
          {
             System.out.print("0");
              System.exit(0);
          };
   };
  if(a[0]>=a[2] && a[0]>=a[1])
  {
       System.out.print(a[2]*a[1]);
  }else if(a[1]>=a[2] && a[0]<=a[1]
   System.out.print(a[0]*a[2]);
   else
    System.out.print(a[0]*a[1]);

}


 
}