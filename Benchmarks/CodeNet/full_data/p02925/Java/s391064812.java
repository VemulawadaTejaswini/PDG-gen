import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[][] A = new int[N][N-1];
    // 各プレイヤーの進捗
    int[] playCount = new int[N];
    for(int i = 0; i < N; i++){
      for(int j = 0; j < N - 1; j++){
        A[i][j] = sc.nextInt() - 1;
      }
    }
    int days = 0;

    // その日そのプレイヤーが試合をしたか
    boolean[] playDone = new boolean[N];
    // その日試合が行われたか
    boolean todayDoGame = false;
    int gameCount = 0;
    int maxGameCount = N * (N - 1) / 2;

    do{
      playDone = new boolean[N];
      todayDoGame = false;
      days++;

      for(int playerNum = 0; playerNum < N; playerNum++){
        if(playCount[playerNum] >= N - 1){
          continue;
        }
        int vsPlayerNum = A[playerNum][playCount[playerNum]];
        //System.out.println("--day:" + days + " ,player1: " + playerNum + ", player2: " + vsPlayerNum);

        if(playerNum == A[vsPlayerNum][playCount[vsPlayerNum]]
          && !playDone[playerNum]
          && !playDone[vsPlayerNum]){
          playCount[playerNum]++;
          playCount[vsPlayerNum]++;
          todayDoGame = true;
          gameCount++;
          playDone[playerNum] = true;
          playDone[vsPlayerNum] = true;
          //System.out.println("day:" + days + " ,player1: " + playerNum + ", player2: " + vsPlayerNum);
        }

      }

      // その日試合が行えない
      if(!todayDoGame){
      //  System.out.print("No Game");
        days = -1;
        break;
      }
      //終了条件
    }while(gameCount < maxGameCount && days != -1);


    System.out.println(days);
  }
}
