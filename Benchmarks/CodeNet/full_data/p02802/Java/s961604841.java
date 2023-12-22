import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] AC = new int[N];
    int[] WA = new int[N];
    for(int i=0; i<N; i++){
      int tmpNum = sc.nextInt()-1;
      boolean isAC = sc.next().equals("AC");
      if(isAC){
        AC[tmpNum] = 1;
      }else{
        if(AC[tmpNum] != 1){
          WA[tmpNum]++;
        }
      }
    }
    int sumAC = 0;
    int sumWA = 0;
    for(int i=0; i<N; i++){
      if(AC[i] == 1){
        sumWA += WA[i];
        sumAC++;
      }
    }
    System.out.println(sumAC + " " + sumWA);
  }
}
    }
        