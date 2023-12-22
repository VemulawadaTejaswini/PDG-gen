import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int answer =0;
    if(a>=13){
      answer=b;
    }else if(6<=a&&a<=12){
      answer = b/2;
    }else{
      null;
    }
    System.out.println(answer);
  }
}