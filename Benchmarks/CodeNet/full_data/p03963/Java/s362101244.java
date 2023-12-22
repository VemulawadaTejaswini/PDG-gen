import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long K = sc.nextLong();
    //一個目はK色、２個目以降は前の色以外のK-1色から選択
    if(N==1){
      System.out.println(K);
      return;
    }
    long answer = K*(long)Math.pow(K-1,N-1);
    System.out.println(answer);
  }
  

  
}