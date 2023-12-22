import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception{
        
      Scanner s = new Scanner(System.in);
        String input = s.nextLine();
      
      boolean isSame = String.valueOf(input.charAt(0)).equals(String.valueOf(input.charAt(1))) &&
        				String.valueOf(input.charAt(1)).equals(String.valueOf(input.charAt(2)));
   
    	System.out.println(isSame ? "No" : "Yes");
    }
}