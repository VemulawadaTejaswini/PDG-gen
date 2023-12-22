import java.util.*;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[] A=new int[N];
    for(int i=0;i<N;i++){    
      A[i] = sc.nextInt();
    }
    
    int num=0;
    int num_tmp=0;
    
    for(int b=0;b<N;b++){
      for(int i=0;i<N;i++){
        num_tmp+=Math.abs(A[i]-(b+i));
      }
      if(num==0 || num>num_tmp){
        num=num_tmp;
      }
    }
    
    System.out.println(num);
    
  }
}
