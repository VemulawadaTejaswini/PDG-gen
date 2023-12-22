import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int ans = 0;
    for(int i = 1;;i++){
      int d = keta(i);
      if((a * i) + (b * d) > c){
        ans = i - 1;
        break;
      }
    }
    System.out.println(ans);
  }
        
  static int keta(int x){
    int ketaCounter = 1;
    for(int j = 10;;j *= 10){
      if(x < j){
        break;
      }
      ketaCounter++;    
    }
    return ketaCounter;
  }
        
}