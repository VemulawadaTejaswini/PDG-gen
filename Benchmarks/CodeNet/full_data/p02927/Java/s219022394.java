import java.util.*;

pubilc class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int D = sc.nextInt();
    int n = 0;
    for( int i = 1; i <= M; i++){
      for( int j = 1; j <= D; j++){
        int da = D/10;
        int db = D%10;
        if( da >= 2 && db >= 2){
          if(M == da*db){
            n++;
          }
        }
      }
    }
    System.out.println(n);
  }
}