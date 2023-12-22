import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[b];
    
    for(int i=0; i<n; i++){
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }
    
    for(int i=0; i<n; i++){
      for(int i=1; i<n; i++){
        if(b[i-1]>b[i]){
          int tmp = b[i-1];
          b[i-1] = b[i];
          b[i] = tmp;
          tmp = a[i-1];
          a[i-1] = a[i];
          a[i] = tmp;
        }
      }
    }
    
    int time = 0;
    boolean flag = true;
    for(int i=0; i<n; i++){
      if(time+a[i]>b[i]){
        flag = false;
        break;
      }
      else{
        time += a[i];
      }
    }
    
    if(falg == true){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}