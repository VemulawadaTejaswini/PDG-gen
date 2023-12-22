import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String inStr = input.nextLine();
        char A = inStr.charAt(0);
        char B = inStr.charAt(1);
        char C = inStr.charAt(2);
        char D = inStr.charAt(3);
        if((A == B && B == C) || (B == C && C == D)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");           
        }
    }
}