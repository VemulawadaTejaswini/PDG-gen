import java.util.*;
import java.io.*;
public class Main {
 public static void main(String[] args) throws Exception {
   Scanner file = new Scanner(System.in);
   int n = file.nextInt();
   int[] a = new int[10000];
   for (int i = 0; i < n; i++) {
    int s = 0;
    String l = file.next();
    for (char c : l.toCharArray()) {
     s += c - 'a'; 
    }
    a[s]++;
   }
   long t = 0;
   for (int i = 0; i < 10000; i++) {
    t += (long) a[i] * (a[i] - 1) / 2;
   }
   System.out.println(t);
 }
}
