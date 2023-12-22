import java.util.Scanner;
import java.lang.Math;
public class test {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
      long a,b,c;
      a=scan.nextLong();
      b=scan.nextLong();
      c=scan.nextLong();
      if((Math.sqrt(a)+Math.sqrt(b))<Math.sqrt(c)){
        System.out.println("No");
      }
      else{
        Syetem.out.println("Yes");
      }
    }
}