import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int h[] = new int[K];
    int landCt =0;
    int answer=0;
    for(int i=0;i<K;i++){
      h[i] = sc.nextInt();
    }
    int start = h[0];
    for(int i=0;i<101;i++){
      landCt=0;
      for(int j=0;j<K-1;j++){
        if((h[j]==0&&h[j+1]>0)||(j==0&&h[0]>0)){
          landCt=landCt+1;
        }
      }
      answer = answer + landCt;
      oneMinus(h);
    }

    if(K!=1){
       System.out.println(answer);
    }else{
      System.out.println(start);
    }
    
  }
  
  public static void oneMinus(int[] h){
    for(int i=0;i<h.length;i++){
      if(h[i]!=0){
        h[i]=h[i]-1;
      }
    }
  }
  
}