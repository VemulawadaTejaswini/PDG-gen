import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long k = sc.nextLong();
    System.out.println(50);
    long p = k/50;
    long q = k%50;
    for(long i=0;i<q;i++)System.out.print((49-(q-1)+p+50)+" ");
    for(long i=q;i<50;i++)System.out.print((49-q+p)+" ");
  }
}
