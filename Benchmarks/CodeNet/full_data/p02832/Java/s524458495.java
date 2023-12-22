import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];

    for(int i=0; i<n; i++){
      int a = sc.nextInt();
      array[i] = a;
    }

    int count =0;
    int broken_brock = 0;

    for(int i=0;i<n;i++){
      if(array[i]!=count+1){
        broken_brock +=1;
      }else{
        count +=1;
      }
    }

    if(broken_brock==n){
      System.out.println(-1);
    }else{
      System.out.println(broken_brock);
    }


  }
}