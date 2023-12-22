import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int billCount = sc.nextInt();
    int sum = sc.nextInt();

    int man = 0,gosen = 0, sen=0;
    boolean flag = false;
    for(int i=0;i<=billCount;i++){
       for(int j=0;j<=billCount-i;j++){
            if(check(i,j,billCount-i-j,sum)){
                man = i;
                gosen = j;
                sen = billCount-i-j;
                flag = true;
            }
       }
    }
    
    if(flag){
      System.out.println(man + " " + gosen + " " + sen);    
    } else {
      System.out.println("-1 -1 -1");
    }
    
  }
  
  public static boolean check(int a,int b, int c, int sum){
      return sum == a * 10000 + b * 5000 + c * 1000;
  }
}