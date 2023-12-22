import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int counter = sc.nextInt();
    
    int answer = 0;
    for(int i = 0;i<counter;i++){
      answer += check(sc.nextInt());
    }
    System.out.println(answer);
  }
  
  public static int check(long number){
    int ans = 0;
    while(number%2 == 0) {
      ans++;
      number = number/2;
    }
    return ans++;
  }
}