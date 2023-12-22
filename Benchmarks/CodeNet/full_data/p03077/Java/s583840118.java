import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n=sc.nextLong(),a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong(),e=sc.nextLong();
    double res=1;
    res+=Math.ceil(n/a);
    res+=Math.ceil(a/b);
    res+=Math.ceil(b/c);
    res+=Math.ceil(d/e);
    System.out.println((long)res);
  }
}
