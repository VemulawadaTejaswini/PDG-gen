import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // get value from StandardIn
    int bingo[] = new int[9];
    int ans[][] = new int[3][3];
    for(int i=0; i<9; i++){
      bingo[i] = Integer.parseInt(sc.next());
    }
    int n = Integer.parseInt(sc.next());
    for(int i=0; i<n; i++){
      int num = Integer.parseInt(sc.next());
      for(int j=0;j<9;j++){
        // System.out.println(j/3 +" "+j%3);
        if(bingo[j]==num){
          ans[j/3][j%3] = 1;
          break;
        }
      }
    }
    // System.out.println(ans[0][0] +" "+ ans[0][1] +" "+ ans[0][2]);
    // System.out.println(ans[1][0] +" "+ ans[1][1] +" "+ ans[1][2]);
    // System.out.println(ans[2][0] +" "+ ans[2][1] +" "+ ans[2][2]);
    int total[] = new int[8];
    for(int i=0; i<3; i++){
      total[0] += ans[0][i];
      total[1] += ans[1][i];
      total[2] += ans[2][i];
      total[3] += ans[i][0];
      total[4] += ans[i][1];
      total[5] += ans[i][2];
    }
    total[6] = ans[0][0] + ans[1][1] + ans[2][2];
    total[7] = ans[0][2] + ans[1][1] + ans[2][0];
    for(int i=0; i<8; i++){
      // System.out.println(total[i]);
      if(total[i] == 3){
        System.out.println("Yes");
        System.exit(0);
      }
    }
    System.out.println("No");
  }
}
