import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a;
        String s;
        a=scan.nextInt();
        s=scan.next();
        if(a<3200) System.out.println("red");
        else System.out.println(s);
    }
}