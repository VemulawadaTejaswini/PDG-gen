import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int H = sc.nextInt();
    int W = sc.nextInt();
    String[] str = new String[H];
    for(int i = 0; i < H; i++){
      str[i] = sc.next();
    }
  
    char[][] wb = new char[H][W];
   
    for(int i = 0; i < H; i++){
      String s = str[i];
      for(int j = 0; j < W; j++){
        wb[i][j] = s.charAt(j);
      }
    }
  
  int count1 = 0;
  for(int i = 0; i < H; i++){
    for(int j = 0; j < W; j++){
        if(wb[i][j] == '.'){
          count1++;
        }
     }
    if(count1 == W){
      for(int k = 0; k < W; k++){
        wb[i][k] = '&';
      }
    }
    count1 = 0;
  }
     
  int count2 = 0;
  for(int j = 0; j < W; j++){
    for(int g= 0; g < H; g++){
        if(wb[g][j] == '.' || wb[g][j] == '&'){
          count2++;
        }
      }
    if(count2 == H){
      for(int k = 0; k < H; k++){
        wb[k][j] = '&';
      }
    }
    count2 = 0;
  } 
    int countAnd = 0;
    for(int h = 0; h < H; h++){
        for(int j = 0;j < W; j++){
          if(wb[h][j] == '&'){
            countAnd++;
          }else{
            System.out.print(wb[h][j]);
          }
        }
      
      if(countAnd == W){
        
      }else{
        System.out.println();
      }
      
      countAnd = 0;
    }
    
  }  
}