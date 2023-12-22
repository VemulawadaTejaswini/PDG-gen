import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int[] priceA=new int[a+1];
        int[] priceB=new int[b+1];
        int minA=Integer.MAX_VALUE,minB=Integer.MAX_VALUE;
        for(int i=1;i<=a;i++)
        {
            priceA[i]=sc.nextInt();
            minA=Math.min(minA,priceA[i]);
        }
        for(int i=1;i<=b;i++)
        {
            priceB[i]=sc.nextInt();
            minB=Math.min(minB,priceB[i]);
        }
        int res=minA+minB;
         for(int i=1;i<=m;i++)
         {
             int x=sc.nextInt();
             int y=sc.nextInt();
             int c=sc.nextInt();
             int price=priceA[x]+priceB[y]-c;
             res=Math.min(res,price);
         }
         System.out.println(res);
    }
}