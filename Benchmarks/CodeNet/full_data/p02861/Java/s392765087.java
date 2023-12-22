import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int[][] b = new int[a][2];
    int d = 0; //道の個数
    double ans = 0;
    int f = 0;
    double g = 0;  
    int h = 1; //組み合わせの数
    
    //町の座標を入力
    for(int i = 0;i < a;i++){
      b[i][0] = sc.nextInt();
      b[i][1] = sc.nextInt(); 
      //System.out.println(b[i][0]);
      //System.out.println(b[i][1]);     
    }
    //2個のパターン数
    for(int j = 1;j < a;j++){ 
      d += j;
    }
    //System.out.println(d); 
    
 	//全パターン数
    for(int w = 1; w <= a;w++){ 
      h *= w;
    }
    //System.out.println(h);
    double[] c = new double[d];
    
    //すべての道の長さを求める
    for(int x = 0;x < a-1;x++){
      for(int y = x + 1;y < a;y++){
       double e = Math.pow(b[x][0] - b[y][0] , 2) + Math.pow(b[x][1] - b[y][1] , 2);
       c[f] = Math.sqrt(e);
        f++;
      }
    }
   //System.out.println(f);
    //System.out.println(Arrays.toString(c));
      
    //道をすべて足す
    for(int z = 0;z < d;z++){
      g += c[z]; 
    }
    //System.out.println(g);
   
    //1組の数
    int k = (h * (a - 1)) / d ;
   //System.out.println(k);
    
    ans = (g * 2)/ a;
   System.out.println(ans);
  }
}