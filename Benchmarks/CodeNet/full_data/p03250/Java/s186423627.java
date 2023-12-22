import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext())
        {
          int x = in.nextInt();
          int y = in.nextInt();
          int z = in.nextInt();
          int max = 0;
          if(y>z)
              max=y;
          else
              max=z;
          String s = Integer.toString(y);
          String t = Integer.toString(z);
          if(max==y) {
              String v = s+z;
              System.out.println(Integer.valueOf(v)+x);
          }
          else {
              String r = t+y;
              System.out.println(Integer.valueOf(r)+x);
          }
        }
    }
}
