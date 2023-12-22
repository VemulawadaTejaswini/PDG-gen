import java.util.*;
import java.io.*;
public class Main {
 public static void main(String[] moo) throws Exception {
   Scanner file = new Scanner(System.in);
   int n = file.nextInt();
   Moo[] m = new Moo[n];
   for (int i = 0; i < n; i++) {
    m[i] = new Moo(i + 1, file.next(), file.nextInt()); 
   }
   Arrays.sort(m);
   for (int i = 0; i < n; i++) {
    System.out.println(m[i].id); 
   }
   file.close();
   System.exit(0);
 }
 public static class Moo implements Comparable<Moo> {
   int id, score;
   String name;
   public Moo(int id, String name, int score) {
    this.id = id;
    this.name = name;
    this.score = score;
   }
   public int compareTo(Moo o) {
    int c = name.compareTo(o.name);
    if (c == 0) {
     return -Integer.compare(score, o.score); 
    }
    return c;
   }
 }
}