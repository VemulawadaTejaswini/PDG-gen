import java.util.*;
public class Main
{
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      HashMap<Long,Integer> map=new HashMap<>();
      while(n-->0)
      {
          long a=sc.nextInt();
          if(map.containsKey(a))
          {
              int c=map.get(a);
              map.put(a,c+1);
          }
          else
          {
              map.put(a,1);
          }
      }
      long sum=0;
      for(Map.Entry<Long,Integer> entry:map.entrySet())
      {
          if(entry.getKey()!=(long)entry.getValue())
          {
             if((long)entry.getValue()>entry.getKey())
             {
                 sum+=(long)entry.getValue()-entry.getKey();
             }
             else
             {
                 sum+=(long)entry.getValue();
             }
          }
      }
      System.out.print(sum);
    }
}
