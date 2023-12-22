import java.util.*;
class Main {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt();
    int n = scanner.nextInt();
    int x = 0;
    int aS = 0;
    
    for(int i=0; i<n; i++){
      x = scanner.nextInt();
      aS += x;
    }  
    
    if(aS>=h){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    
  }
}