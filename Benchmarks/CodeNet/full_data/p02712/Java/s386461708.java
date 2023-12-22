import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    //3でも5でも割り切れる  FizzBuzz
    //3で割り切れる        Fizz
    //5で割り切れる        Buzz
    
    for (int i = 0; i < N; i++){
      if ( !(i%3 == 0 || i%5 == 0) )
        sum += sum + i;
    }
    System.out.println(sum);
    
  }
}