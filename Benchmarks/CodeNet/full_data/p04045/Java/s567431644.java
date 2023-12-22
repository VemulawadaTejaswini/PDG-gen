import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cost = Integer.parseInt(sc.next());
    int dislike = Integer.parseInt(sc.next());
    int[] numbers = new int[10];
    for(int i=0; i<dislike; i++){
      numbers[Integer.parseInt(sc.next())] = 1;
    }
    int pay = cost;
    while(true){
      if(judge(numbers, pay)){
        System.out.println(pay);
      }else{
        pay++;
      }
    }
  }
  
  private static boolean judge(int[] check, int n){
    int i = 1;
    int re = 0;
    while(true){
      re = n%(int)Math.pow(10, i)-n%(int)Math.pow(10, i-1);
      for(int j=0; j<check.length; j++){
	    if(check[re] == 1){
          return false;
        }
      }
      if(re == n%(int)Math.pow(10, i+1)-n%(int)Math.pow(10, i)){
        return true;
      }
      i++;
    }
  }
}