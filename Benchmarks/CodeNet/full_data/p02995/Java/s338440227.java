import java.util.Scanner;

class Main{

    private static long e;
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);

         long a=sc.nextLong();
         long b=sc.nextLong();
         long c=sc.nextLong();
         long d=sc.nextLong();
         long e=0;

     for(long i=a;i<=b;i++)
     {
         if(i%c!=0)
         {
             if(i%d!=0)
             {
                 e++;
             }
         }
     }
     System.out.println(e);
    }
}