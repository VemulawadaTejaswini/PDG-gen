import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    int c[] = new int[100000];
    int zeroC=0;
    int eC=0;
    int oC=0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      c[A[i]-1]++;
    }
    Arrays.sort(c);
    for(int i=0;i<100000;i++){
      if(c[i]==0){
        zeroC++;
      }else if(c[i]>1&&c[i]%2==0){
        eC++;
      }else{
        oC++;
      }
    }
    if(eC%2==1){
      System.out.println(100000-zeroC-1);
    }else{
      System.out.println(100000-zeroC);
    }
    
  }
  

  
}