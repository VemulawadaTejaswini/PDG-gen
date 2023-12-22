import java.util.*;
public class Main
{ public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    int  c=sc.nextInt();
    int d=sc.nextInt();
    if(((c*d))%2==0)
    System.out.println((c*d)/2);
    else
    System.out.println((c*d)/2+1);
}
}