import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt(), W = sc.nextInt();
    String[][] S = new String[H][W];
    int ansH = -1,ansW = -1;
    for(int i=0;i<H;i++){
      for(int j=0;j<W;j++){
        S[i][j] = sc.next();
        if(S[i][j].equals("snuke")){
          ansH = i;
          ansW = j;
        }
      }
    }
    System.out.println((char)('A'+ansW)+""+(ansH+1));
  }
}