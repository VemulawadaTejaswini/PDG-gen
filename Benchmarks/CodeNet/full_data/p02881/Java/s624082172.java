import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    double s = Math.sqrt((double)N);
    int n = (int)s;
    
    int x = 1;
    int y = 1;
    int afterX = 0;
    int afterY = 0;
    
    for(int i=n; i>0; i--){
      if(N % i == 0){
        afterX = i;
        break;
      }
    }
    
    if(afterX != 0){
      afterY = N / afterX;
      System.out.println((afterX-x) + (afterY-y));
    }else{
      System.out.println(N - 1);
    }
  }
}
