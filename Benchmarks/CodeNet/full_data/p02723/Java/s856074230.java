import java.uti.Scanner;
public class Arge{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5))
            System.out.print("Yes");
        else 
            System.out.print("No");
    }
}