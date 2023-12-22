import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int A = sc.nextInt();
    int answer = 0;
    if(H%A==0){
      answer = H/A;
    }else{
      answer = H/A+1;
    }
    System.out.println(answer);
  }
  

  
}