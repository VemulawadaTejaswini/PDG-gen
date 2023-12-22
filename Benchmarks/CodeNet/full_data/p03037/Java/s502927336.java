import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();    
    int[][] c = new int[b][2];
    int ans = 0;
    for(int i = 0;i < b;i++){
      for(int j = 0;j < 2;j++){
        c[i][j] = sc.nextInt();
      }
    }
    for(int x = 1;x <= a;x++){
      int count = 0;
      for(int y = 0;y < b;y++){
        for(int z = c[y][0];z <= c[y][1];z++){
          if(z == x){
            count++;
            break;
          }
        }
      }
      if(count == b) ans++;
    }
    System.out.println(ans);
  }
}