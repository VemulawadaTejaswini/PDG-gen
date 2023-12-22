import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections; 
 
public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> Alist = new ArrayList<Integer>();
    for (int i =0; i<N; i++) {
      Alist.add(sc.nextInt());
    }
    Set<Integer> Aset = new HashSet<Integer>(Alist);
    int count =0;
    for(int s: Aset){
      int a = Collections.frequency(Alist,s);
      if (a % 2 == 1) count++;
    }
    System.out.println(count);  
  }
}