import java.util.*;
public class Main
{ public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
    int  v=sc.nextInt();
    int d=sc.nextInt();
    int  a=sc.nextInt();
    double ab=Math.sqrt(v)+Math.sqrt(d);
    double cd=Math.sqrt(a);
    if(cd>ab)
    System.out.println("Yes");
    else
    System.out.println("No");
}
}