import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int[][] card = new int[3][3];
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        card[i][j] = in.nextInt();
      }
    }
    int n = in.nextInt();
    int[] target = new int[n];
    for(int i=0; i<n; i++){
      target[i] = in.nextInt();
    }
    System.out.println(bingo(card, target));
  }
  
  static String bingo(int[][] card, int[] target){
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        for(int k=0; k<target.length; k++){
          if(card[i][j] == target[k]){
            card[i][j] = 0;
            break;
          }
        }
      }
    }
    if(card[0][0]==0 && card[0][1]==0 && card[0][2]==0) return "Yes";
    if(card[1][0]==0 && card[1][1]==0 && card[1][2]==0) return "Yes";
    if(card[2][0]==0 && card[2][1]==0 && card[2][2]==0) return "Yes";

    if(card[0][0]==0 && card[1][0]==0 && card[2][0]==0) return "Yes";
    if(card[0][1]==0 && card[1][1]==0 && card[2][1]==0) return "Yes";
    if(card[0][2]==0 && card[1][2]==0 && card[2][2]==0) return "Yes";

    if(card[0][0]==0 && card[1][1]==0 && card[2][2]==0) return "Yes";
    if(card[0][2]==0 && card[1][1]==0 && card[2][0]==0) return "Yes";
    return "No";
  }
}
