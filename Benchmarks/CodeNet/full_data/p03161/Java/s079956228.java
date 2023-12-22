import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int K=sc.nextInt();
        sc.nextLine();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
          list.add(sc.nextInt());
        List<Integer> dyn=new ArrayList<Integer>();
        dyn.add(0);
        dyn.add((int)(Math.abs(list.get(1)-list.get(0))));
        for(int i=2;i<n;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=K;j++)
              {
                  if(i-j>=0)
                   {
                          min=(int)Math.min(min,Math.abs(list.get(i)-list.get(i-j))+dyn.get(i-j));
                   }
                   if(i-j<0)
                    break;
              }
            dyn.add(min);
        }
        System.out.println(dyn.get(n-1));
        sc.close();
    }
}