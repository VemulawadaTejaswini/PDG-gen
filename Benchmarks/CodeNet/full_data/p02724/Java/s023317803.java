import java.util.*;
public class Main
{public static void main(String args[])
   { Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int h=n/500;
     int rest=n-(h*500);
     int f=rest/5;
     int tot=h*1000 + f*5;
    System.out.println(tot);
   }
}