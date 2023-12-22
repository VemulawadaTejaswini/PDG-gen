import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //2桁目以降どっか０だったら全部ゼロじゃないとImpossible？
    //1桁目は1じゃなかったらImpossible
    int N = sc.nextInt();
    int A[] = new int[(int)Math.pow(2,N)];
    String s = sc.next();
    for(int i=0;i<A.length;i++){
      A[i]=Integer.parseInt(s.substring(i,i+1));
    }
    if(A[0]!=0){
      System.out.println("Impossible");
      return;
    }
    
    
  }
  

  
}
