import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if (s.contains("C")) {
            s=s.substring(indexOf("C")+1);
            if (s.contains("F")) {
                System.out.println("Yes");
            }
        }else {
            System.out.println("No");
        }
    }
}