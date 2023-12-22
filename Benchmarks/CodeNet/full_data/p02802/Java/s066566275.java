import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

class Submission {
  int id;
  boolean ac;
}

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
  
    Submission[] subs = new Submission[M];
    for (int i=0; i<M; i++) {
      int id = sc.nextInt();
      String ac = sc.next();
      subs[i] =  new Submission();
      subs[i].id = id - 1;
      subs[i].ac = "AC".equals(ac);  
    }
    
    boolean[] aced = new boolean[N];
    for (int i=0; i<N; i++) {
      aced[i] = false;
    }

    int acNum = 0;
    int penalty = 0;

    for (int i=0; i<M; i++) {
      Submission sub = subs[i];
      if (aced[sub.id]) {
        continue;
      } else if (sub.ac) {
        aced[sub.id] = true;
        acNum += 1;
      } else {
        penalty += 1;
      }
    }

    sc.close();
    System.out.println(acNum + " " + penalty);
  }
}