import java.util.*;
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  int N=in.nextInt();
  int K=in.nextInt();
  int p=-1;int u;
  p=Math.abs(N-K);
  while(true)
  {
    N=Math.abs(p-K);
    u=N;
    N=Math.abs(N-K);
    if(N>=u)
    {
      System.out.println(u);break;
    }
    else
    {
      p=N;
    }
  }
}
}
   
    
    