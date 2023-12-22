import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        String ans;

        if (a-x>b-x) {
            ans = "B";
        }
        else {
            ans = "A";
        }
        System.out.println(ans);
    }
}