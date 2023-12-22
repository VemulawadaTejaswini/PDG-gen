import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        String[] s = new String[H];
        for(int i = 0; i < H; i++){
          s[i] = sc.next();
        }
      
        int[][] hm = new int[H][M];
        for(int i = 0; i < H; i++){
          for(int j = 0; j < M ; j++){
            if(s[i].charAt(j) == '.'){
              hm[i][j] = 0;
            }else{
              hm[i][j] = 100;
            }
           
          }
        }
      
        for(int i = 0; i < H; i++){
            for(int j = 0; j < M ; j++){
              if(i==0 && j==0){ //左上端用
                if(hm[i][j+1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j+1] >= 100){
                  hm[i][j]++;
                }
              }else if(i==0 && j==M-1){ //右上端用
                if(hm[i][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 100){
                  hm[i][j]++;
                }
              }else if(i==H-1 && j==0){ //左下端用
                if(hm[i-1][j] >= 100){
                  hm[i][j]++;
                }
                if(hm[i-1][j+1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i][j+1] >= 100){
                  hm[i][j]++;
                }
              }else if(i==H-1 && j==M-1){ //右下端用
                if(hm[i-1][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i-1][j] >= 100){
                  hm[i][j]++;
                }
                if(hm[i][j-1] >= 100){
                  hm[i][j]++;
                }
              }else if(j==0 && i!=0 && j==0 && i!=H-1){ //左用
                if(hm[i-1][j] >= 100){
                  hm[i][j]++;
                }
                if(hm[i-1][j+1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i][j+1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j+1] >= 100){
                  hm[i][j]++;
                }
              }else if(j==M-1 && i!=0 && j==M-1 && i!=H-1){ //右用
                if(hm[i-1][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i-1][j] >= 100){
                  hm[i][j]++;
                }
                if(hm[i][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 100){
                  hm[i][j]++;
                }
              }else if(i==0 && j!=0 && i==0 && j!=M-1){ //上用
                if(hm[i][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i][j+1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j+1] >= 100){
                  hm[i][j]++;
                }
              }else if(i==H-1 && j!=0 && i==H-1 && j!=M-1){ //下用
                if(hm[i][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i][j+1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i-1][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i-1][j] >= 100){
                  hm[i][j]++;
                }
                if(hm[i-1][j+1] >= 100){
                  hm[i][j]++;
                }
              }else{ //その他用
                if(hm[i-1][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i-1][j] >= 100){
                  hm[i][j]++;
                }
                if(hm[i-1][j+1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i][j+1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j-1] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j] >= 100){
                  hm[i][j]++;
                }
                if(hm[i+1][j+1] >= 100){
                  hm[i][j]++;
                }
              }
               
            }
        }
      
            for(int i = 0; i < H; i++){
              for(int j = 0; j < M ; j++){
                if(hm[i][j] >= 100){
                  System.out.print("#");
                }else{
                System.out.print(hm[i][j]);
                }
              }
              System.out.println();
            }
       
	}
}