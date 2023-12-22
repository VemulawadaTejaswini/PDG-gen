import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int K=scanner.nextInt();
        int leftover=A+B-K;
        System.out.println("left cokkies:"+leftover);

    }
}




