import java.util.*;
import java.math.*;
class Main{
public static void main(String[] args) {
  Scanner stdIn = new Scanner(System.in);
  int n = stdIn.nextInt();
  int[] p = new int[n];
  for(int i = 0;i<p.length;i++) {
    p[i] = stdIn.nextInt();
  }
  int[] unko = new int[3];
  int count = 0;
  for(int i = 0;i<p.length-2;i++) {
    int a = p[i];
    int b = p[i+1];
    int c = p[i+2];
    unko[0] = a;
    unko[1] = b;
    unko[2] = c;
    Arrays.sort(unko);
    if(unko[1]==b) {
      count += 1;
    }
  }
  System.out.println(count);
}
}
