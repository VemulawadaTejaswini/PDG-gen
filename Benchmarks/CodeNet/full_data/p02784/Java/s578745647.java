import java.util.Scanner;
class Main{
  public static void main(String arr[])
  {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int a[];
    a=new int[n];
    for(int i=0;i<a.length;i++)
    {
     a[i]=sc.nextInt();
          }
    int i=0;
    while(i<a.length && h>0)
    {  
       h=h-a[i];
      i++;
 
    }
    if(h<=0)
    {
     System.out.print("yes"); 
    }
    else{System.out.print("no");}
       
  }
}
