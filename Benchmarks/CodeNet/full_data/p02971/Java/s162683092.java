import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N =  sc.nextInt();
    int biggestans = 0;
    int nextbig = 0;
    int place = 0;
    for(int i=0;i<N;i++){
      int A = sc.nextInt();
      if (A>biggestans){
        nextbig = biggestans;
        biggestans = A;
        place = i;
      }else{
        nextbig = Math.max(nextbig,A);
    }
    }
    for (int j=0;j<N;j++){
      if (j==place){
        System.out.println(nextbig);
      }else{
    System.out.println(biggestans);
      }
    }
  }
}