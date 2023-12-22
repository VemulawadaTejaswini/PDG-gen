import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = String.valueOf(a.length() -2);
        String c = String.valueOf(a.charAt(0));
        String d = String.valueOf(a.charAt(a.length()-1));
        System.out.println(c+b+d);
    }
}