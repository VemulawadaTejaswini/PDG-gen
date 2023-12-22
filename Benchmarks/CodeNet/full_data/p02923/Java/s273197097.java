import java.io.*;
import java.util.*;
 
class Main
{
  public static void main(String Args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    int max =0;int prevval = in.nextInt();
    int currcount=0;
    for(int i =1;i<n;i++)
    {
      int val =in.nextInt();
      if(val<=prevval)
      {
        currcount++;
      }
      else
      {
        if(max<currcount)
          max = currcount;
        currcount=0;
      }
      prevval =val;
    }
    if(max<currcount)
        max = currcount;
    System.out.println(max);
  }
}