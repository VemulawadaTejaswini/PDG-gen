import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cost = Integer.parseInt(sc.next());
    int dislikeN = Integer.parseInt(sc.next());
    int[] dislikeArray = new int[10];
    for(int i=0; i<10; i++){
      dislikeArray[Integer.parseInt(sc.next())] = 1;
    }
    
    int pay = cost;
    int safety = 0;
    while(true){
      for(int i=0; i<dislikeN; i++){
        if(judge(dislikeArray[i], pay) && i==dislikeN-1){
          System.out.println(pay);
          safety++;
          break;
        }
      }
      if(safety != 0){
        break;
      }
      pay++;
    }
  }
  
  private static boolean judge(int check, int n){
    while(true){
      if(n%10 == check){
        return false;
      }
      n = n/10;
      if(n == 0){
        return true;
      }
    }
  }