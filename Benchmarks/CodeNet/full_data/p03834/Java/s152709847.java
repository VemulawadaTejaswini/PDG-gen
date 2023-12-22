import java.util.Scanner;

public class Main {
    
     public static void main(String[] args) {
        
        String s;
        
        Scanner input = new Scanner(System.in);
        
        s = input.nextLine();
        
        String s1 =  s.replace(",", " ");
       
        System.out.println(s1);
        
    }
}
