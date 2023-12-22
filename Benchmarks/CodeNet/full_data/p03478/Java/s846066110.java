import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int finalSum = 0;
    
    for(int i = 1; i <= N; i++){
      int c = i;
      int sum = 0;
      while(c > 0){//cの全ての桁を見終えたとき
        sum = sum + c % 10;
        c = c / 10;
      }
      if(sum <= B && A <= sum){
      	//finalSum = finalSum + sum;
        //finalSum = finalSum + c;
        finalSum = finalSum + i;
      }
    }
    System.out.println(finalSum);
  }
}
      