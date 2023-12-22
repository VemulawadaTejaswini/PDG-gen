import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N,M;
    ArrayList<Integer> L = new ArrayList<Integer>();
    ArrayList<Integer> R = new ArrayList<Integer>();
    N = s.nextInt();
    M = s.nextInt();
    for(int i = 0; i < M ;i++){
      L.add(s.nextInt());
      R.add(s.nextInt());
    }
    int First = 0,Final = 0;
    int count = 0;
    if(M == 1){
      if(R.get(0) == 0)
      count = 0;
      else
        count = R.get(0) - L.get(0) + 1;
    }
    else{
      for(int j = 0; j < N ; j++){
        boolean lr = false,LR = false;
        if(j >= L.get(0) && j <= R.get(0))lr = true;
        if(j >= L.get(1) && j <= R.get(1))LR = true;
        if(lr && LR){
          count++;
          Final = j;
        }
      }
      First = Final - count + 1;
      ///*
      for(int i = 2; i < M ; i++){
        count = 0;
        for(int j = First; j <= Final ; j++){
          boolean lr = false,LR = false;
          if(j >= First && j <= Final)lr = true;
          if(j >= L.get(i) && j <= R.get(i))LR = true;
          if(lr && LR){
            count++;
            Final = j;
          }
        }
        First = Final - count + 1;
      }
    }

    //*/
    System.out.println(count);
  }
}
