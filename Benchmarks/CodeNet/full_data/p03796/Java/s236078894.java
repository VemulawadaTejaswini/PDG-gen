import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long P = 1000000007L;
    int N = sc.nextInt();
    long answer =1;
    for(int i=1;i<=N;i++){
      answer=(answer*i)%P;
    }
    System.out.println(answer);
  }
  

  
}