import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      //取得
	  int[][] c = new int[3][3];
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          c[i][j]=sc.nextInt();
        }
      }
      String ans = "No";
      for(int i=0;i<2;i++){
        if((c[0][i]-c[0][i+1]==c[1][i]-c[1][i+1]) && (c[0][i]-c[0][i+1]==c[2][i]-c[2][i+1])){
          ans = "Yes";
        }
      }
      System.out.println(ans);
    }
}