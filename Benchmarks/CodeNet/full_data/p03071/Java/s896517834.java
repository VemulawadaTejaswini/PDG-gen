import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int answer = 0;
    if(a==b){
      answer = 2*a;
    }else{
      answer = Math.max(a,b) + Math.max(a,b) -1;
    }
    System.out.println(answer);
  }
  

  
}
