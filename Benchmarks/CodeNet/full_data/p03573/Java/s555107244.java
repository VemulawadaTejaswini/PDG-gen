import java.util.Scanner;

class Main{
  public static void main(String args[]){
    
    Scanner scan = new Scanner(System.in);
    int n1 = scan.nextInt();
    int n2 = scan.nextInt();
    int n3 = scan.nextInt();
    
    if (n1 == n2) {
    	System.out.println(String.valueOf(n3));
    }else if (n1 == n3) {
    	System.out.println(String.valueOf(n2));
    }else if (n2 == n3) {
    	System.out.println(String.valueOf(n1));
    }
	return;
  }
}

