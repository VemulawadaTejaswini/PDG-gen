import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    int count = 1;
    int k2 = k;
    
    if(n < k){
      System.out.println(1);
    }
    
    for(int i=1; i<n; i++){
      if( (k*k2)-1 < n ){
        count++;
        k2 *= k;
      }
      
      if( (k*k2)-1 >= n ){
        count++;
        break;
      }
    }
    
    System.out.println(count);
    
  }
}
