import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S[] = new String[N];
    String answer ="Three";
    for(int i=0;i<N;i++){
      if(sc.next().equals("Y")){
        answer="Four";
      }
    }
    System.out.println(answer);

  }
  

  
}