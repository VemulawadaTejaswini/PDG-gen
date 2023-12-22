import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //回数
      	int n = sc.nextInt();
        int preT = 0;
        int preX = 0;
        int preY = 0;
      for(int i = 0; i < n; i++){
        //時刻
        int postT = sc.nextInt();
        //x座標
        int postX = sc.nextInt();
        //y座標
        int postY = sc.nextInt();
        
        int dt = postT - preT;
        int dist = Math.abs(postX - preX) + Math.abs(postY - preY);
        if((dt < dist) || ((dist - dt) % 2 != 0)){
          System.out.println("NO");
          return;
        }
        preT = postT;
        preX = postX;
        preY = postY;
      }
      
      System.out.println("YES");
    }
}