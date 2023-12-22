import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char a = s.charAt(2);
        char b = s.charAt(3);
        char c = s.charAt(4);
        char d = s.charAt(5);
        if(a == b && c == d){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}