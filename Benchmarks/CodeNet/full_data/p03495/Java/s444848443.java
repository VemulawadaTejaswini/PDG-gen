import java.util.*;
 class Main {
    public static void main(String args[]) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[t];
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int i;
        for(i=0;i<t;i++)
        a[i]=sc.nextInt();
        for(i=0;i<t;i++)
        {
            if(h.containsKey(a[i]))
            {
                int x=h.get(a[i]);
                h.put(a[i],x+1);
            }
            else
            h.put(a[i],1);
            
        }
        int b[]=new int [h.size()];
        i=0;
        for(Integer key:h.keySet())
        {
            int y=h.get(key);
            b[i]=y;
            i++;
        }    
        Arrays.sort(b);
        
        int sum=h.size()-n;
        int sum2=0;
        for(i=0;i<sum;i++)
        {
           sum2+=b[i];
        }
        System .out.println(sum2);
    }
}

     