import java.util.Scanner;
import java.lang.Math;
public class Main {
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    Long a=scan.nextLong(),b=scan.nextLong(),c=scan.nextLong();
    if ((int(Math.pow(a,0.5))+int(Math.pow(b,0.5)))>int(Math.pow(c,0.5))){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
  }
}
}