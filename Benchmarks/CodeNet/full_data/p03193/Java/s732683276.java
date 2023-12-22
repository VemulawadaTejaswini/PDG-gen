import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] hw = new int[n][2];
    
    for(int i=0; i<n; i++){
      for(int j=0; j<2; j++){
        hw[i][j] = sc.nextInt();
      }
    }
    
    int cnt = 0;
    
    for(int i=0; i<n; i++){
      if(hw[i][0] >= h && hw[i][1] >= w){
        cnt++;
      }
    }
    
    System.out.println(cnt);
  }
}
