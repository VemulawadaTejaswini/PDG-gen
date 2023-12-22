import java.util.Scanner;
class Main{
  public void fun() {
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
    while(i<a.length)
    {  
       h=h-a[i];
      i++;
 
    }
    if(h<=0)
    {
     System.out.print("Yes"); 
    }
    else{System.out.print("No");}
    
  }
  public static void main(String arr[])
  {
       Main m = new Main();
    	m.fun();
  }
}
