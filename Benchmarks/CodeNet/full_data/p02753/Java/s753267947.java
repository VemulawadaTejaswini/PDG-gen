import java.util.Scanner;
public class Amon01{
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);

        String one = scan.nextLine();
        String two = scan.nextLine();
        String three = scan.nextLine();

        if(one.equals(two)) 
           if(two.equals(three)) System.out.printf("No");
           else System.out.printf("Yes");
        else System.out.printf("Yes");
           

    }
}