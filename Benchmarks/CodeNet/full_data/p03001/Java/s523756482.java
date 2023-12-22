import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int w = stdIn.nextInt();
    int h = stdIn.nextInt();
    int x = stdIn.nextInt();
    int y = stdIn.nextInt();
    int hantei = 0;
    int min[] = new int[10];
    int minok = 0;
      min[0] = x*h;
      min[1] = h*(w-x);
      min[2] = y*w;
      min[3] = (h-y)*w;
      min[4] = Math.max(min[0],min[1]);
      min[5] = Math.max(min[2],min[3]);
      if(min[4]>min[5]) {
        System.out.println(min[5]);
        System.out.println(0);
      } else if(min[4]<min[5]) {
        System.out.println(min[4]);
        System.out.println(0);
      } else {
        System.out.println(min[4]);
        System.out.println(1);
      }
    }
  }
