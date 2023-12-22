import java.util.Scanner;
class Main
{
  public static void main(String[] asgda)
  {
    int cor=0;
    int inc=0;
   Scanner sc=new Scanner(System.in);
    int n,m;
    n=sc.nextInt();
    m=sc.nextInt();
    int que;
    String sta;
     int[] x=new int[n+1];
    for(int i=0;i<m;i++)
    {
     que=sc.nextInt();
      //String s1=sc.nextLine();
      sta=sc.nextLine();
     // System.out.println(sta);
      //System.out.println((x[que]==0) +" "+sta.equals("AC"));
      if(x[que]==0 && sta.equals(" AC"))
      {
      	
        x[que]=1;
        cor++;
        //System.out.println(que+ "  "+sta+ " cor ");
      }
      else if(x[que]==0 && sta.equals(" WA"))
      {
        inc++;
       // System.out.println(que+ "  "+sta+ " inc "+inc);
      }
    }
   
    System.out.println(cor+" "+inc);
   
    
  }
}