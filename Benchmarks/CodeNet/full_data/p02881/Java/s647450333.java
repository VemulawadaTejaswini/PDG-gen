import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    double s = Math.sqrt((double)N);
    long n = (long)s;
    
    int x = 1;
    int y = 1;
    long afterX = 0;
    long afterY = 0;
    
    for(long i=n; i>0; i--){
      if(N % i == 0){
        afterX = i;
        break;
      }
    }
    
    afterY = N / afterX;
    System.out.println((afterX-x) + (afterY-y));
  }
}
