
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner (System.in);
    int max = cin.nextInt();
    int mul = cin.nextInt();

    if (mul%2==0){
      int start = mul/2;
      int time = max/start;
      double res;
      if (time%2==0){
        res = Math.pow((time/2),3)*2;
      }
      else {
        res = Math.pow(time/2+1,3)+Math.pow(time/2,3);
      }
      System.out.println(res);
      //System.out.println((res==114191));
    }

    else {
      int time = max / mul;
      double res = (int)Math.pow(time,3);
      System.out.println(res);
      //System.out.println((res==114191));
    }

  }

}
