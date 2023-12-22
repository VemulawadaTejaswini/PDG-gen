import java.util.*;

public class Main {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     long  box = new long(1000000000);
     int count = 0;
     for (int i = 0 ; i < n; i ++) {
        box[sc.nextLong()]++;
        if(box[sc.nextLong()] % 2 != 0) {
           count++;
        } else {
           count--;
        }
     }
     System.out.println(count);
  }
}