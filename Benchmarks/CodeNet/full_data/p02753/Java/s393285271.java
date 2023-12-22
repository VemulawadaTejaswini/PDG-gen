import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);

        String one = scanner.next();
        String two = scanner.next();
        String three = scanner.next();

        if(one.equals(two)) 
           if(two.equals(three)) System.out.printf("No");
           else System.out.printf("Yes");
        else System.out.printf("Yes");
           

    }
}