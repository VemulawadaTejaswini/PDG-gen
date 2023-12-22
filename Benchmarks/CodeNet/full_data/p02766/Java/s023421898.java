import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        String s=Integer.toString(Integer.parseInt(String.valueOf(a),10),b);
        System.out.println(s.length());
    }
}
