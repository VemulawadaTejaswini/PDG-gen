import java.util.*;

class Main {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    int x = scanner.next(); //next(文字列), nextDouble, nextLine(1行)とか
    if (x % 10 == 7){
      System.out.println("Yes");
    }
    
    else if ((x/10)%10 == 7){
      System.out.println("Yes");
    }
    
    else if ((x/100) == 7){      
    
    	System.out.println("Yes");
    }
    
    System.out.println("No");
  }
}
