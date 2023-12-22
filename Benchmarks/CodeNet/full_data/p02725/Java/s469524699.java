import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        long[] houses=new long[n];
        for(int i=0;i<n;i++)
        {
            houses[i]=sc.nextInt();
        }
       
        long ans=0;
        long ans1=Long.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
             long distance=0;
              long distance1=0;
              if(i==n-1)
              {
                  distance+=(k-houses[n-1])+(houses[n-2]-houses[1]);
              }
              else
              distance+=(houses[n-1])-(houses[i]);
           if(i==0)
           {
               distance1=(k-houses[n-1])+(houses[n-1]-houses[1]);
           }
           else
           distance1+=(houses[i])-(houses[0]);
           if(i!=0 && i!=n-1)
           {
               distance+=(k-houses[n-1])+(houses[i-1]-houses[0]);
               distance1+=((k-houses[n-1])+(houses[n-1]-houses[i+1]));
           }
           //System.out.println(i+" "+distance+" "+distance1);
           if(distance!=0 && distance1!=0)
           ans=Math.min(distance,distance1);
           else
           {
              if(distance==0)
              {
                  ans=distance1;
              }
              else
              ans=distance;
           }
           //System.out.println(i+" "+ans);
           if(ans<ans1)
           {
               ans1=ans;
           }
        }
        System.out.println(ans1);
    }
}