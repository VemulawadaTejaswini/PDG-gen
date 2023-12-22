import java.util.Scanner;

class Main{
	
	public static void main(String args[]){
      
	  Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      
      if(input.equals("AAA") == true){
        System.out.println("No");
	  }else if(input.equals("BBB") == true){
        System.out.println("No");
      }else{
        System.out.println("Yes");
      }
	}
}
