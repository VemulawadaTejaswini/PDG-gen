import java.util.Scanner;
import java.util.Set; 
import java.util.TreeSet; 
import java.util.Iterator; 
import java.util.ArrayList; 

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int K = sc.nextInt();
    Set<String> p = new TreeSet<String>();
    for (int i =1; i<=Math.min(5,s.length()); i++ ) {
      for (int j =0; j+i<s.length()+1; j++) {
        String a = s.substring(j,j+i);
        p.add(a);
      }
    }
    Iterator it = p.iterator();
    StringBuilder sb = new StringBuilder();
    int i =1;
    while (i < K) {
      sb.append(it.next());
      i++;
    }
    System.out.println(it.next());
  }
}   