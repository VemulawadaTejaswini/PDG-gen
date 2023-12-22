import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long input = Long.parseLong(scanner.next());
    scanner.close();

    long ans = input;
    int input_length = (int)Math.log10(input);

    if(input_length == 0){
      System.out.println(input);
    }else{
      for(int i=1; i<(int)Math.pow(2, input_length); i++){
        ans += cal(addHere(i, input_length), input);
      }
      System.out.println(ans);
    }
  }

  private static boolean[] addHere(int count, int length){
    boolean[] bools = new boolean[length];
    for(int i=0; i<length; i++){
      if(count%2 == 1){
        bools[i] = true;
      }
      count /= 2;
    }
    return bools;
  }

  private static long cal(boolean[] bools, long in){
    int jackPot = 1;
    long ans = 0;
    for(int i=0; i<bools.length; i++){
      if(bools[i]){
        ans += in % (long)Math.pow(10, jackPot);
        in /= (long)Math.pow(10, jackPot);
        jackPot = 1;
      }else{
        jackPot ++;
      }
    }
    ans += in;
    return ans;
  }
}
