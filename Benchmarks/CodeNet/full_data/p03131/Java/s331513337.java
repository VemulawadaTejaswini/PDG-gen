import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), money = 0;
    long bis = 1;
    for(int i = 1; i <= k; i++){
      if(i != k){
      	if ((b-a) != 1){
          if (money > 0){
            bis += b;
            money -= 1;
          }else if(bis < a){
            bis += 1;
          }else if(bis >= a){
            bis -= a;
            money += 1;
          }
        }else{
          bis += 1;
        }
      }else{
        bis += 1;
      }
    }
    System.out.println(bis);
  }
}