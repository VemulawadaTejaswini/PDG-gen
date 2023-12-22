import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    long A = Long.parseLong(S[0]);
    long B = Long.parseLong(S[1]);
    long x = Long.parseLong(S[2]);
    long ans = 0;
    
    for(long i = A; i <= B; i++){
      if(i % x == 0){
        ans++;
      }
    }
    System.out.println(ans);
  }
}