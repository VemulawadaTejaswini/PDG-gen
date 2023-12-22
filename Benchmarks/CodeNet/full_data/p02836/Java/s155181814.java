import java.util.Scanner;

public class Main {
 
  public static void main(String[] args) {
  
	String str;
    int num, A1;
    
    Scanner scanner = new Scanner(System.in);
    str = scanner.nextLine();
   	
    for (int i=0; i < str.length() / 2; i++) {
    	if(str.charAt(i) != str.charAt(str.length()-1-i)){
          num++;
        }
    }
  System.out.println(num);
  }
  
}