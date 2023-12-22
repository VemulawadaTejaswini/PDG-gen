import java.util.Scanner;
import java.text.DecimalFormat;

class Main {
  static public void main(String args[]) {
    DecimalFormat dformat = new DecimalFormat("000");
    int n = Integer.parseInt(args[0]);
    if(n < 1000){
      System.out.println("ABC" + dformat.format(n));
    } else {
      System.out.println("ABD" + dformat.format(n-1000));
    }
      return ;
    }
}
