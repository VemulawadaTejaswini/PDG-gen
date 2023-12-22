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
    
    boolean[] acs = new boolean[N];
    int[] penalties = new int[N];
    for (int i=0; i<N; i++) {
      acs[i] = false;
      penalties[i] = 0;
    }

    for (int i=0; i<M; i++) {
      Submission sub = subs[i];
      if (acs[sub.id]) {
        continue;
      } else if (sub.ac) {
        acs[sub.id] = true;
      } else {
        penalties[sub.id] += 1;
      }
    }

    int ac = 0;
    int penalty = 0;
    for (int i=0; i<N; i++) {
      if (acs[i]) {
        ac += 1;
        penalty += penalties[i];
      }
    }

    sc.close();
    System.out.println(ac + " " + penalty);
  }
}