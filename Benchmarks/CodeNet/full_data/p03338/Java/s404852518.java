import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    while(input.hasNext()){
      int N = input.nextInt();
      String S = input.next();

      int[] countCharX = new int[26];
      int[] countCharY = new int[26];
      int maxDiff = 0;
      for(int i = 1; i < S.length() - 1; ++i){
        Arrays.fill(countCharX, 0);
        Arrays.fill(countCharY, 0);

        for(int j = 0; j < i; ++j){
          ++countCharX[S.charAt(j) - 'a');
        }

        for(int j = i; j < S.length(); ++j){
          ++countCharY[S.charAt(j) - 'a');
        }
        
        int bothContain = 0;
        for(int j = 0; j < countCharX.length; ++j){
          if(countCharX != 0 && countCharY != 0){
            ++bothContain;
          }
        }

        maxDiff = Math.max(maxDiff, bothContain):
     }
     System.out.println(maxDiff);
    } 
  }
}
    