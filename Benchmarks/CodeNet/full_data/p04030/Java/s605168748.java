import java.util.Scanner;

public class Main{
  public static void main(String args[]) {
    Scanner stdln = new Scanner(System.in);
    String str = stdln.nextLine();
    String array[] = str.split("");
    int i = 0;
    System.out.println(array[4]);
    System.out.println(array.length);
    String[] arrayx = new String[1];
    arrayx[0] = "B";
    String x = "B";
    while(i < array.length){
      if(array[i].equals("B")) {
        if(i > 0) {
          array[i] = null;
          array[i-1] = null;
        }else{array[i] = null;}
      }
      i++;
    }
    StringBuilder buf = new StringBuilder();
    String s = null;
    int j = 0;
    while(j < array.length){
      if (array[j] != null) {
        buf.append(array[j]);
        j++;
      }else j++;
    }
    s = new String(buf);
    System.out.println(s);
  }
}
