import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int answer=0;
    answer=answer+1;
    if(b!=a){
      answer=answer+1;
    }
    if(c!=a&&c!=b){
      answer=answer+1;
    }
    System.out.println(answer);

  }
  

  
}
