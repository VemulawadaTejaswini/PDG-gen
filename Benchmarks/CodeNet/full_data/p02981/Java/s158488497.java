public class Main{
  public static void main(String[] args){
    
    int N = new java.util.Scanner(System.in).nextInt();
    int A = new java.util.Scanner(System.in).nextInt();
    int B = new java.util.Scanner(System.in).nextInt();
   
    int x = N * A;
    int y = B;
    
    if (x < y){                       
    	System.out.println(x);
    }else if (x > y){
    	System.out.println(y); 
    }else if (x == y){
    	System.out.println(y); 
    }
  }
}