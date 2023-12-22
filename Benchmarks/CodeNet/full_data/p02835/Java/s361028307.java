import java.util.Scanner;

class Main{
  public satatic void(String[] args){
    
    Scanner scanner = new Scanner(System.in)
      
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    
    int sum = A + B + C;
    
    if(sum >= 22){
      System.out.println("bust");
    }else{
      System.out.println("win");
    }
  
  }
  
}

    
    