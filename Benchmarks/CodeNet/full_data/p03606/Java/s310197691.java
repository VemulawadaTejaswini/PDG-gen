import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int tmpl=0;
    int tmpr=0;
    int answer =0;
    for(int i=0;i<N;i++){
      tmpl=sc.nextInt();
      tmpr=sc.nextInt();
      answer = answer+tmpr-tmpl+1;
    }
    System.out.println(answer);
  }
  

  
}