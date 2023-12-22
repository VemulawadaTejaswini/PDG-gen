import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String first = a.substring(2,4);
        String second = a.substring(4,6);
         
        String first1 = first.substring(0,1);
        String first2 = first.substring(1,2);
        
        String second1 = second.substring(0,1);
        String second2 = second.substring(1,2);
        
        if(first1.equals(first2) && second1.equals(second2)) {
        	System.out.println("Yes");

        }else {
        	System.out.println("No");
        }
        
    }
}