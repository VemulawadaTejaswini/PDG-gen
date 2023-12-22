import java.util.Scanner;
class Main{
  public static void main(String[] args){
  	
    Scanner scan = new Scanner(System.in);
    
    int n = scan.nextInt();
    int k = scan.nextInt();
    
    String res = Integer.toString(n, k);
      
    System.out.println(res.length());
 
  }
}