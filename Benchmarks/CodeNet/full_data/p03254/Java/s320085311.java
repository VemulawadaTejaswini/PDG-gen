import java.util.*;
import java.util.Arrays;


public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int [] a = new int[N];
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    
    int i=0;
    while(x>0&&i<N){
      x-=a[i];
      i++;
    }
    if(x!=0){
      i--;
    }
    System.out.println(i);
    
    
  }
}
                          
                         
                    
    
    
    
    
    
    
