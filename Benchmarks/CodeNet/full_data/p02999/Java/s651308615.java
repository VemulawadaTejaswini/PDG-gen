import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int a = s.nextInt();
        if(x<a){
            System.out.println(0);
        }else{
            System.out.println(10);
        }
    }
}
