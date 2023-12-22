import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

   	int n = scanner.nextInt();
	
   	if(f(n)){
    	System.out.println(1);
    }else{
    	System.out.println(0);
    }
    
    scanner.close();

  }
  
  public static boolean f(int x){
      if(x==0){
        return true;
      }else if(x<0){
        return false;
      }else if(f(x-100)){
		return true;
      }else if(f(x-101)){
        return true;
      }else if(f(x-102)){
        return true;
      }else if(f(x-103)){
        return true;
      }else if(f(x-104)){
        return true;
      }else if(f(x-105)){
        return true;
      }else{
        return false;
      }
  }

}