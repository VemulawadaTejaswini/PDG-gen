import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] problemNum = new int[m];
    String[] result = new String[m];

    for(int i = 0; i < m; i++){ //attempts
      problemNum[i] = sc.nextInt();
      result[i] = sc.next();
    }

    boolean afterAC = false;
    int penaltyCount = 0;
    int correctCount = 0;
    for(int i = 0; i < m; i++){
      if( i == 0 ){
        if( result[i].equals("WA") ){
          penaltyCount++;
        }else{
          correctCount++;
          afterAC = true;
        }
      }else{
        if( problemNum[i] == problemNum[i-1] ){
        }else{
          afterAC = false;
        }

        if( result[i].equals("WA") ){
          if(afterAC){
          }else{
            penaltyCount++;
          }
        }else{
          if(afterAC){
          }else{
            correctCount++;
            afterAC = true;
          }
        }
      }
    }
    System.out.println(correctCount+" "+penaltyCount);
  }
}