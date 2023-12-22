import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      if(A[i]%2==1){
        continue;
      }else if(A[i]%3!=0&&A[i]%5!=0){
        System.out.println("DENIED");
        return;
      }else{
        continue;
      }
    }
    System.out.println("APPROVED");
    
  }
  

  
}