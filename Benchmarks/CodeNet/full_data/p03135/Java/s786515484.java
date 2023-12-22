import java.util.*;

 class atcoder{
     public static void main(String args[]){
         Random r = new Random();
         int N=r.nextInt(8)+3;
         System.out.println(N+"角形");
         int[] L=new int[N];
         System.out.println("辺の長さは");
         for(int i=0;i<N;i++){
             L[i]=r.nextInt(100)+1;
             System.out.print(L[i]+",");
         }

	System.out.println();

        int sumOfLeft=0;
        int max=0;
        int side=0;
         for(int i=0;i<L.length;i++){
             side=L[i];
             if(max<side){
                 sumOfLeft+=max;
                 max=side;
             }
             else{
                 sumOfLeft+=side;
             }
         }
	System.out.println("最大の辺："+max+"その他の総和："+sumOfLeft);
         if(sumOfLeft>max) System.out.println("この多角形は開いている可能性があります");
         else System.out.println("この多角形は閉じています");

     }
 }
