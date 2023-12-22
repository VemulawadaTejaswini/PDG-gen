import java.util.*;

public class Mofu{
  public static void main(String[] args){
  	Scanner scan = new Scanner(System.in);
    
    int mofu[] = new int[3];
    
    for(int i = 0; i < 3 ; i++){
   	 mofu[i] = scan.nextInt();
    }
    
    int maxmofu = mofu[0];
    int minmofu = mofu[0];
    
    //大小比較
    for(int i = 1; i < 3 ; i++){
      
      if(maxmofu < mofu[i]){
        maxmofu = mofu[i];
      }
      if(minmofu > mofu[i]){
        minmofu = mofu[i];
      }
    }
    System.out.println("合計コストは" + (maxmofu - minmofu) + "です。");
  }
}