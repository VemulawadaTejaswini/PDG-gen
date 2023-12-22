import java.util.Scanner;
public class Main{
    //087
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt()-in.nextInt();
        int b=in.nextInt();
        System.out.println(x-(x/b)*b);
    }
}
