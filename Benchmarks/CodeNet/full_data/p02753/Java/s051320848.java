import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
         if ((S.charAt(1) == S.charAt(2))&&(S.charAt(2)== S.charAt(3))){
          System.out.println("No");
         }
         else {System.out.println("Yes");
                }
        }
    }