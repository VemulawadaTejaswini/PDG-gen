import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections; 

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Long> Alist = new ArrayList<Long>();
    Set<Long> Aset = new HashSet<Long>(Alist);
    for (int i =0; i<N; i++) {
      long A = sc.nextLong();
      Alist.add(A);
      Aset.add(A);
    }
    int count =0;
    for(long s: Aset){
      int num = Collections.frequency(Alist,s);
      if (num % 2 == 1) count++;
    }
    System.out.println(count);  
  }
}