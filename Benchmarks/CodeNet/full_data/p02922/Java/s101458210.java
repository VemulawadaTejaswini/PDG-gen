import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    
    int a,b;
 
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    
	double doubleA;
    double doubleB;
      
    doubleA = (double) a;
    doubleB = (double) b;
    
    System.out.println(Math.ceil( (doubleB - 1.0 ) / (doubleA - 1.0 ) ));
    
    return;
  }
}

    
    
    