

import java.util.Scanner;

class Main{

  
  public static void main(String agr[]){
  
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    if((a+b+c) == 10){
    System.out.println("YES");
    }
    else {
    System.out.println("NO");
    }
  }
}