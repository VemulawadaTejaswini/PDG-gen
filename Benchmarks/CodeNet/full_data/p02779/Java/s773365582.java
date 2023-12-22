import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int a[] = new int[n];
    
    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
    }
    
    int b = 0;
    
    for(int i = 0; i < n; i++){
      for(int j = n - 1; j > i; j--){
        if(a[i] == a[j]){
          b++;
          break;
        }
      }
    }
    
    if(b == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
    sc.close();
    
    
    
  }
}
