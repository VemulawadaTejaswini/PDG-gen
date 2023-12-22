import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long input_n = Long.parseLong(scanner.next());
    long input_s = Long.parseLong(scanner.next());
    scanner.close();

    boolean isFound = false;
    if(input_n == input_s){
      System.out.println(input_n+1);
      isFound = true;
    }else{
      for(int i=2; i<=Math.pow(input_n, 0.5); i++){
        if(input_s == merge(i, input_n)){
          System.out.println(i);
          isFound = true;
          break;
        }
      }
      if(!isFound){
        for(int i=(int)Math.pow(input_n, 0.5); i>0; i--){
          if((input_n-input_s)%i==0 && (int)Math.pow(input_n, 0.5)<(input_n-input_s)/i+1){
            if(input_s == merge((input_n-input_s)/i+1, input_n)){
              System.out.println((input_n-input_s)/i+1);
              isFound = true;
              break;
            }
          }
        }
      }
    }
    if(!isFound){
      System.out.println(-1);
    }
  }

  private static long merge(long exp, long n){
    if(n < exp){
      return n;
    }else{
      return merge(exp, n/exp) + n%exp;
    }
  }
}
