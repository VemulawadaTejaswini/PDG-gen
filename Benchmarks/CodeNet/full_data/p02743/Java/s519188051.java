import java.util.Scanner;
import java.lang.Math;
public class Main {
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    long a=(long)Math.sqrt(scan.nextLong())+Math.sqrt(scan.nextLong()),c=(long)Math.sqrt(scan.nextLong());
    if ((a)>c){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
  }
}
}
