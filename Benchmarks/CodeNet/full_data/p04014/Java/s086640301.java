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
    }else{
      for(int i=2; i<=Math.pow(input_n, 0.5); i++){
        if(input_s == merge(i, input_n)){
          System.out.println(i);
          isFound = true;
          break;
        }
      }
      if(!isFound){
        long ans = 0;
        for(int i=2; i<Math.pow(input_n, 0.5); i++){
          if((input_n-input_s)%i == 0){
            ans = (input_n-input_s)/i + 1;
          }
        }
        if(ans < Math.pow(input_n, 0.5)){
          System.out.println(-1);
        }else{
          System.out.println(ans);
        }
      }
    }
  }

  private static long merge(int exp, long n){
    if(n < exp){
      return n;
    }else{
      return merge(exp, n/exp)+ n%exp;
    }
  }
}
