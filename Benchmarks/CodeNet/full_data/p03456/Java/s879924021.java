import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        a = a.concat(b);
        int num = Integer.parseInt(a);
        int n = (int)Math.sqrt(num);
        if(n*n==num) System.out.println("Yes");
        else System.out.println("No");
    }
}