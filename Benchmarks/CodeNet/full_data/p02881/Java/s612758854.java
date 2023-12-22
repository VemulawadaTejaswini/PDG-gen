import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long min = N / 1;
    long min2 = N / min;
    long total = min + min2;
    
    for(long i=2; i<N; i++){
      if(N % i == 0){
        min = N / i;
        min2 = N / min;
        if(total > (min + min2)){
          total = min + min2;
        }
      }
    }
    
    System.out.println(total-2);
  }
}

